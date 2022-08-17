import java.util.Random;

public class app {
    public static void main(String[] args) {
        //set-up (Write Down Information.)

        int hourAM = 0;//(1~12)      //(오전 시간 적는 곳)
        int hourPM = 0;//(1~12)      //(오후 시간 적는 곳)
        String airPollutionRate = "Good";  //  Choose one (Good,Average,Bad,VeryBad)
        String isClean = "Good"; // Choose one (Good,Average,Dirty,Awful)
        String HC = "medium"; //Choose one (hot,medium,cold)

        // ---------------------------------------------------------------------------------------------------------------//

        //공기 정청기
        String airClean = "Turn On AirCleaner";
        String airCleanOff = "Turn Off AirCleaner";
        String airCleanAuto = "--AirCleaner Turning On!--";
        String airCleanAutoOff = "--AirCleaner Turning Off!--"; //공기 청정기 잘때는 2시간을 주기로 꺼졌다 켜짐, 미세먼지 나쁨부터 무조건 튼다.

        //불빛(용도: 잘때 일어날때)
        String lightOn = "--Light Turning On!--";
        String lightOff = "--Light Turning Off!--";

        //랜덤값 이용하기
        Random random = new Random();

        //AM Work
        if (hourAM == 1){  //1 : 공기 정화 됨,
            System.out.println(airCleanAuto);
        }
        if (hourAM == 2){  //2
            System.out.println(airCleanAutoOff);
        }
        if (hourAM == 3){  //3
            System.out.println(airCleanAuto);
        }
        if (hourAM == 4){  //4
            String[] HCrate = {"hot","medium","cold"};
            if (HC.equals(HCrate[0])){
                System.out.println("--AirConditioner Turning On--");
            }
            else if (HC.equals(HCrate[2])){
                System.out.println("--Heater Turning On--");
            }else {

            }

            System.out.println(airCleanAutoOff);
        }
        if (hourAM == 5){  //5
            System.out.println(airCleanAuto);
        }
        if (hourAM == 6){  //6
            String[] Clean = {"Good" , "Average" , "Dirty" , "Awful"};
            if (isClean.equals(Clean[0])){
                System.out.println("----The house is very Clean.----");
            }
            if (isClean.equals(Clean[1])){
                System.out.println("----The house is  Clean.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[2])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[3])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On----");
            }
        }
        if (hourAM == 7){  //7
            System.out.println(lightOn);
            String[] curtain = {"--Curtain Opening--", "--Curtain Closing--"};
            System.out.println(curtain[0]);

            System.out.println("Wake Up!!! and Be Ready For School");
            String[] breakfastMenu = {"Instant Oatmeal With Cranberries and Pecans", "Roasted Potato and Chorizo Hash",
                    "PB Chocolate Sheet Pan Pancake", "Lemon-Almond Poppy Seed Muffins"};
            System.out.println("Your Lunch is " + breakfastMenu[random.nextInt(3)]);

            String[] airPollution = { "Good","Average", "Bad","VeryBad"};

            if (airPollutionRate.equals(airPollution[0])){
                System.out.println("AirPollution is " + airPollution[0] + ".\n" + "It is good for you to go out.");
            }
            if (airPollutionRate.equals(airPollution[1])){
                System.out.println("AirPollution is " + airPollution[1] + ".\n" + "You may play outside.");
            }
            if (airPollutionRate.equals(airPollution[2])){
                System.out.println("AirPollution is " + airPollution[2] + ".\n" + "Take care when you go outside!");
            }
            if (airPollutionRate.equals(airPollution[3])){
                System.out.println("AirPollution is " + airPollution[3] + ".\n" + "You better not play outside!!");
            }

        }
        if (hourAM == 8){  //8
            System.out.println("Time To GO to School");
        }
        if (hourAM == 9){  //9 가정
            String[] subject = {"home","Korean","history","math","science","english"};
            System.out.println("Time to study " +subject[0] );
        }
        if (hourAM == 10){  //10 국어
            String[] subject = {"home","Korean","history","math","science","english"};
            System.out.println("Time to study " +subject[1] );
            String[] Clean = {"Good" , "Average" , "Dirty" , "Awful"};
            if (isClean.equals(Clean[0])){
                System.out.println("----The house is very Clean.----");
            }
            if (isClean.equals(Clean[1])){
                System.out.println("----The house is  Clean.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[2])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[3])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On----");
            }
        }
        if (hourAM == 11){  //11 역사
            String[] subject = {"home","Korean","history","math","science","english"};
            System.out.println("Time to study " +subject[2] );
            System.out.println();
        }
        if (hourAM == 12){  //12 수학
            String[] subject = {"home","Korean","history","math","science","english"};
            System.out.println("Time to study " +subject[3] );
            System.out.println();
        }

        // ---------------------------------------------------------------------------------------------------------------//

        //PM
        if (hourPM == 1){  //1
            System.out.println("Time To Eat Lunch");
            //랜덤함수 이용하기
            String[] lunchMenu = {"Chicken Salad","Tuna Melt on Cornbread","Turkey Spinach Salad with Maple Dressing",
                    "Peanut Butter, Chicken and Basil Sandwich","Hasselback Tomato Clubs"};
            System.out.println("Why Don't You Eat  " + lunchMenu[random.nextInt(4)] + "?");
        }
        if (hourPM == 2){  //2 과학
            String[] subject = {"home","Korean","history","math","science","english"};
            System.out.println("Time to study " +subject[4] );
            String[] Clean = {"Good" , "Average" , "Dirty" , "Awful"};
            if (isClean.equals(Clean[0])){
                System.out.println("----The house is very Clean.----");
            }
            if (isClean.equals(Clean[1])){
                System.out.println("----The house is  Clean.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[2])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[3])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On----");
            }
            System.out.println();
        }
        if (hourPM == 3){  //3 영어
            String[] subject = {"home","Korean","history","math","science","english"};
            System.out.println("Time to study " +subject[5] );
            System.out.println();
        }
        if (hourPM == 4){  //4
            System.out.println("School Finished!! Time to Have Break!");

            String[] HCrate = {"hot","medium","cold"};
            if (HC.equals(HCrate[0])){
                System.out.println("--AirConditioner Turning On--");
            }
            else if (HC.equals(HCrate[2])){
                System.out.println("--Heater Turning On--");
            }else {

            }

            String[] snack = {"an ice cream with chocolate syrup", "Mixed nuts", "Apple slices with peanut butter", "Cherry tomatoes with mozzarella" };
            System.out.println("Do You Want to Eat  " + snack[random.nextInt(3)] + "?");
        }
        if (hourPM == 5){  //5
            String[] Clean = {"Good" , "Average" , "Dirty" , "Awful"};
            if (isClean.equals(Clean[0])){
                System.out.println("----The house is very Clean.----");
            }
            if (isClean.equals(Clean[1])){
                System.out.println("----The house is  Clean.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[2])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[3])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On----");
            }
            System.out.println();
        }
        if (hourPM == 6){  //6
            String[] HCrate = {"hot","medium","cold"};
            if (HC.equals(HCrate[0])){
                System.out.println("--AirConditioner Turning On--");
            }
            else if (HC.equals(HCrate[2])){
                System.out.println("--Heater Turning On--");
            }else {

            }

            String[] dinnerMenu = {"Baked Feta Pasta","One-Pan Creamy Chicken & Gnocchi","Classic Stuffed Peppers","Air Fryer Pork Chops","Black Bean Tostadas"};
            System.out.println("Do You Want to Eat  " + dinnerMenu[random.nextInt(4)] + "?");
        }
        if (hourPM == 7){  //7
            System.out.println("Wake Up");
        }
        if (hourPM == 8){  //8
            System.out.println("Time To GO to School");
        }
        if (hourPM == 9){  //9
            String[] Clean = {"Good" , "Average" , "Dirty" , "Awful"};
            if (isClean.equals(Clean[0])){
                System.out.println("----The house is very Clean.----");
            }
            if (isClean.equals(Clean[1])){
                System.out.println("----The house is  Clean.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[2])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On---");
            }
            if (isClean.equals(Clean[3])){
                System.out.println("----The house is very Dirty.----\n----Robotic Vaccum Turning On----");
            }
            System.out.println();
        }
        if (hourPM == 10){  //10
            System.out.println("Do School Homework!");
        }
        if (hourPM == 11){  //11
            String[] HCrate = {"hot","medium","cold"};
            if (HC.equals(HCrate[0])){
                System.out.println("--AirConditioner Turning On--");
            }
            else if (HC.equals(HCrate[2])){
                System.out.println("--Heater Turning On--");
            }else {

            }

            System.out.println("Let's read book before going bed!\n");
            System.out.println("Books Available\n\n1984\nTo Kill a Mockingbird\nAnimal Farm\nCrime and Punishment\nOne Hundred Years of Solitude\nHarry Potter and the Sorcerer's Stone");
        }
        if (hourPM == 12){  //12
            System.out.println(airClean);
            System.out.println("Go to Bed");
            System.out.println(lightOff);
            String[] curtain = {"--Curtain Opening--", "--Curtain Closing--"};
            System.out.println(curtain[1]);

        }
    }
}
