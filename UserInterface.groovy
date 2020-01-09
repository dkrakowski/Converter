class UserInterface {
    void logo(){
        String author = "Dkrakowski"
        String logo ="\n" +
                "\n" +
                "   ______                           __           \n" +
                "  / ____/___  ____ _   _____  _____/ /____  _____\n" +
                " / /   / __ \\/ __ \\ | / / _ \\/ ___/ __/ _ \\/ ___/\n" +
                "/ /___/ /_/ / / / / |/ /  __/ /  / /_/  __/ /    \n" +
                "\\____/\\____/_/ /_/|___/\\___/_/   \\__/\\___/_/     \n" +
                "                                                 \n" +
                ""



                println(logo)
                print("Created by $author")
    }

    void contextHelp(){
        String helpMessage = " What you want to do:" +
                "\n1.Convert length: mile to kilometer (type 1)" +
                "\n2.Convert length: kilometer to mile (type 2)" +
                "\n3.Convert mass: pound to kilogram (type 3)" +
                "\n4.Convert mass: kilogram to pound (type 4)" +
                "\n5.Close Converter application (type 5)"
        print(helpMessage)
    }
}
