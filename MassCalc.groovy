class MassCalc {
    void poundToKilogram(double pound){
        //println('You select pound (lb) to kilogram (kg) converter')
        double kilogram
        kilogram = pound / 2.2046
        println("$pound lb in kilogram is $kilogram kg")
    }

    void kilogramToPound(double kilogram){
        //println('You select kilogram (kg) to pound (lb) converter')
        double pound
        pound = kilogram * 2.2046
        println("$kilogram kg in pound is $pound lb")
    }
}
