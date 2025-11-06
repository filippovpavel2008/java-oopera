public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 185);
        Actor actor2 = new Actor("Денис", "Иванов", Gender.MALE, 182);
        Actor actor3 = new Actor("Лидия", "Петровна", Gender.FEMALE, 183);

        Director director1 = new Director("Джеймс", "Кемерон", Gender.MALE, 23);
        Director director2 = new Director("Скот", "Ридли", Gender.MALE, 33);

        MusicalShow regularShow = new MusicalShow(director1, 123, "Кошки",
                "Ханс Циммер", "Ляляля");

        Opera operaShow = new Opera(director1, 123, "Начало",
                "Ханс Циммер", "Ляляля", 12);

        Ballet balletShow = new Ballet(director2, 123, "Черный лебедь",
                "Ханс Циммер", "Тратата", "Хореограф Хореографич");

        regularShow.addNewActor(actor1);
        regularShow.addNewActor(actor2);

        operaShow.addNewActor(actor3);
        operaShow.addNewActor(actor1);

        balletShow.addNewActor(actor1);
        balletShow.addNewActor(actor2);
        balletShow.addNewActor(actor3);

        regularShow.actorsInfo();
        operaShow.actorsInfo();
        balletShow.actorsInfo();

        regularShow.replaceActor(actor3, "Иванов");
        regularShow.actorsInfo();

        operaShow.replaceActor(actor2, "Доу");

        operaShow.printLibretto();
        balletShow.printLibretto();
    }
}
