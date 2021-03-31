package lesson5;



public class Bag {
    private Item[] items;

    public Bag(Item[] items) {
        this.items = items;
    }

    int findBestSumOfItemsInBag(int i, int weight){
        if (i < 0){
            return 0;
        }
        if (items[i].getWeigth() > weight) {
            return findBestSumOfItemsInBag(i - 1, weight);
        } else {
            return Math.max(findBestSumOfItemsInBag(i - 1, weight),
            findBestSumOfItemsInBag(i - 1, weight - items[i].getWeigth()) + items[i].getPrice());
        }
    }
}
