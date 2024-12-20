package org.example;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            switch(item.name) {
                case "Aged Brie":
                    if (item.quality < 50) {
                        item.increaseQualityByOne();
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    item.increaseQualityByOne();

                    if (item.sellIn < 11) {
                        item.increaseQualityByOne();
                    }
                    if (item.sellIn < 6) {
                        item.increaseQualityByOne();
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    item.sellIn -= 1;
                    break;
                default:
                    item.decreaseQualityByOne();
                    break;

            }

            switch(item.name) {
                case "Aged Brie":
                    if (item.sellIn < 0) {
                        item.decreaseQualityByOne();
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    if (item.quality > 0) {
                        item.decreaseQualityByOne();
                    }
                    break;
            }
        }
    }
}