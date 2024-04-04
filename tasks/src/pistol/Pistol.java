package pistol;

public class Pistol {
    private int count = 5;
    private int maxCount = 5;

     public Pistol(int count, int maxCount) {
        if (maxCount < 0)
            throw new IllegalArgumentException("Максимальное кол-во патронов не может быть отрицательным");
        this.maxCount = maxCount;
        if (count < 0 || count > maxCount)
            this.count = maxCount;
        else
            this.count = count;

    }
    public Pistol() {}

    public void shot() {
        if (count == 0) {
            System.out.println("Клац!");
            return;
        }
        System.out.println("Бах!");
        count--;
    }
    public String shotSilence() {
        if (count == 0) {
            return "Клац!";
        }
        count--;
        return "Бах!";
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getCount() {
        return count;
    }

    public int load(int count) {
        if (!checkCount(count)) {
            this.count = maxCount;
            return count - maxCount;
        }
        this.count += count;
        return 0;
    }

    public int unload()
    {
        int unloaded = this.count;
        this.count = 0;
        return unloaded;
    }

    private boolean checkCount(int count) {
         if (count < 0)
             throw new IllegalArgumentException("Кол-во патронов не может быть отрицательным");
         if (count > maxCount || count + this.count > maxCount)
             return false;
         return true;
    }
}
