package com.juansalazar.solid.d;

class CashBad {

    public void pay(Product product, PaymentType paymentType) {

        MySqlDatabaseBad persistence = new MySqlDatabaseBad();
        persistence.save(product, paymentType);

    }

}
