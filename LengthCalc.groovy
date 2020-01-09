class LengthCalc {
    void mileToKilometer(double mile){
        //println('You select mile (mi) to kilometer (km) converter')
        double kilometer
        kilometer = mile / 0.62137
        println("$mile mi in kilometr is $kilometer km")
    }
    void kilometerToMile(double kilometer){
        //println('You select kilometer (km) to mile (mi) converter')
        double mile
        mile = kilometer * 0.62137
        println("$kilometer km in mile is $mile mi")
    }
}