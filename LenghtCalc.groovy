class LenghtCalc {
    void mileToKilometr(double mile){
        //println('You select mile (mi) to kilometer (km) converter')
        double kilometr
        kilometr = mile / 0.62137
        println("$mile mi in kilometr is $kilometr km")
    }
    void kilometrToMile(double kilometr){
        //println('You select kilometer (km) to mile (mi) converter')
        double mile
        mile = kilometr * 0.62137
        println("$kilometr km in mile is $mile mi")
    }
}
