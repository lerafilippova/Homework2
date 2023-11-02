package org.example;

public class DiscountsOnShirts {
    private final int priceOneShirtWithoutDiscount = 2550;
    private final int selectedShirts = 5;
    private final int numberShirtsNeedToBuyToGetDiscount = 3;
    private final int numberShirtsNeedToAddToGetDiscount = numberShirtsNeedToBuyToGetDiscount - selectedShirts;
    private final int priceSelectedShirtsWithoutDiscount = priceOneShirtWithoutDiscount * selectedShirts;
    private final int totalPriceShirtsWithoutDiscountNeedToGetDiscount = priceOneShirtWithoutDiscount * numberShirtsNeedToBuyToGetDiscount;
    private final double percentageOfDiscount = 0.25;
    private final double priceAllShirtsWithDiscount = priceSelectedShirtsWithoutDiscount * percentageOfDiscount;
    private final double priceOneShirtWithDiscount = priceOneShirtWithoutDiscount * percentageOfDiscount;
    private final double amountOfSavedMoney = priceSelectedShirtsWithoutDiscount - priceAllShirtsWithDiscount;
    private final double freeShirts = amountOfSavedMoney / priceOneShirtWithoutDiscount;
}