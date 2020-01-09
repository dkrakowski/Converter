UserInterface ui = new UserInterface()
ui.logo()
ui.contextHelp()

def inputConverterType

while (1) {
    println("")
    print("Type which converter start: ")


    try {
        inputConverterType = System.console().readLine().toInteger()
    } catch (Exception exp) {
        println("Error during recognize converter type, pleas try again")
    }

  switch (inputConverterType){
        case 1:
            def mile

            print("Type value for convert: ")

            try {
                mile = System.console().readLine().toDouble()
            } catch (Exception exp) {
                println("Error during convert type, pleas try again")
            }
            LengthCalc mileCalc = new LengthCalc()
            mileCalc.mileToKilometer(mile)
            mileCalc = null
            break
        case 2:
          def kilometer

          print("Type value for convert: ")

          try {
              kilometer = System.console().readLine().toDouble()
          } catch (Exception exp) {
              println("Error during convert type, pleas try again")
          }
          LengthCalc kilometerCalc = new LengthCalc()
          kilometerCalc.kilometerToMile(kilometer)
          kilometerCalc = null
          break
            break
        case 3:
          def pound

          print("Type value for convert: ")

          try {
              pound = System.console().readLine().toDouble()
          } catch (Exception exp) {
              println("Error during convert type, pleas try again")
          }
          MassCalc poundCalc = new MassCalc()
          poundCalc.poundToKilogram(pound)
          poundCalc = null
            break
        case 4:
          def kilogram

          print("Type value for convert: ")

          try {
              kilogram = System.console().readLine().toDouble()
          } catch (Exception exp) {
              println("Error during convert type, pleas try again")
          }
          MassCalc kilogramCalc = new MassCalc()
          kilogramCalc.kilogramToPound(kilogram)
          kilogramCalc = null
            break
      case 5:
          println("Bye!")
          System.exit(1)
          break
        default:
            println("You chose not exist converter calculator code")
    }
}