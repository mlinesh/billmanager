package com.biller.billler;

import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        Bill bill = new Bill();
        bill.setBillId(123);
        bill.setBilDate(new Date());
        bill.setBillAmoujt(25.85);

        System.out.println(bill);
        
    }
}
