package com.tcs.swagger.integration.util;


import com.tcs.swagger.integration.model.Item;

public interface ItemUtil {
    public static void mapNotNullValues(Item source, Item item) {
        if(item!=null ) {

            if(item.getItemCode()!=null) source.setItemCode(item.getItemCode());
            if(item.getItemCost()!=null) source.setItemCost(item.getItemCost());


        }
    }
}
