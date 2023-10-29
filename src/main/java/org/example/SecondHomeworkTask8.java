package org.example;

public class SecondHomeworkTask8 {
    final int priceOneShirtWithoutDiscount = 2550;
    final int selectedShirts = 5;
    final int numberShirtsNeedToBuyToGetDiscount = 3;
    final int numberShirtsNeedToAddToGetDiscount = numberShirtsNeedToBuyToGetDiscount - selectedShirts;
    final int priceSelectedShirtsWithoutDiscount = priceOneShirtWithoutDiscount * selectedShirts;
    final int totalPriceShirtsWithoutDiscountNeedToGetDiscount = priceOneShirtWithoutDiscount * numberShirtsNeedToBuyToGetDiscount;
    final double percentageOfDiscount = 0.25;
    final double priceAllShirtsWithDiscount = priceSelectedShirtsWithoutDiscount * percentageOfDiscount;
    final double priceOneShirtWithDiscount = priceOneShirtWithoutDiscount * percentageOfDiscount;
    final double amountOfSavedMoney = priceSelectedShirtsWithoutDiscount - priceAllShirtsWithDiscount;
    final double freeShirts = amountOfSavedMoney / priceOneShirtWithoutDiscount;
}
