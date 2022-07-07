package com.juansalazar.solid.d;

class MySqlDatabase implements Persistence {

    public void save(Product product, PaymentType paymentType) {
        System.out.println("Save product " + product + " paymentType " + paymentType);
        // save into MySqlDatabase...
    }

}
