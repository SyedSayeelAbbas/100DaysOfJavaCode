import java.util.Scanner;
public class Day12_BasicQuizGame {
    public static void easyMode(){
        Scanner select=new Scanner(System.in);
        char optionChoosed;
        int rigth=0,wrong=0;
        System.out.println("\t\"YOU HAVE SELECTED EASY MODE\"\nChoose the right Answer:");
        System.out.println("Q1:What is the largest continent on Earth?\na)Africa\n"
                +"b) Asia\nc) North America\nd) South America\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("You are rigth b) Asia is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option b) Asia is rigth answer");
            wrong++;
        }
        System.out.println("Q2:What is the Earth's largest ocean?\n" +
                        "\n" +
                        "Options:\n" +
                        "a) Atlantic Ocean\n" +
                        "b) Arctic Ocean\n" +
                        "c) Indian Ocean\n" +
                        "d) Pacific Ocean\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='d')
        {
            System.out.println("You are rigth d) Pacific Ocean is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option d) Pacific Ocean is rigth answer");
            wrong++;
        }
        System.out.println("Q3:What causes day and night on Earth?\n" +
                "\n" +
                "Options:\n" +
                "a) Earth's revolution around the Sun\n" +
                "b) Earth's rotation on its axis\n" +
                "c) The Moon's orbit around Earth\n" +
                "d) The Sun's movement across the sky\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("You are rigth b) Earth's rotation on its axis is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option b) Earth's rotation on its axis is rigth answer");
            wrong++;
        }
        System.out.println("Q4:What are the four main layers of the Earth?\n" +
                "\n" +
                "Options:\n" +
                "a) Crust, Mantle, Core, Atmosphere\n" +
                "b) Land, Water, Air, Ice\n" +
                "c) Soil, Rocks, Minerals, Fossils\n" +
                "d) Mountains, Valleys, Plains, Plateaus\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='c')
        {
            System.out.println("You are rigth a) Crust, Mantle, Core, Atmosphere is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option a) Crust, Mantle, Core, Atmosphere is rigth answer");
            wrong++;
        }
        System.out.println("Q5:What is the process called when water vapor turns into liquid water?\n" +
                "\n" +
                "Options:\n" +
                "a) Evaporation\n" +
                "b) Condensation\n" +
                "c) Precipitation\n" +
                "d) Transpiration\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("You are rigth b) Condensation is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option b) Condensation is rigth answer");
            wrong++;
        }
        System.out.println("Q6:What is the greenhouse effect?\n" +
                "\n" +
                "Options:\n" +
                "a) A type of cloud formation\n" +
                "b) The process of plants using sunlight\n" +
                "c) The warming of the Earth's atmosphere\n" +
                "d) The movement of tectonic plates\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='c')
        {
            System.out.println("You are rigth c) The warming of the Earth's atmosphere is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option c) The warming of the Earth's atmosphere is rigth answer");
            wrong++;
        }
        System.out.println("Q7:What is the ozone layer?\n" +
                "\n" +
                "Options:\n" +
                "a) A layer of gases in the atmosphere that protects us from UV radiation\n" +
                "b) A type of cloud\n" +
                "c) A layer of rock beneath the Earth's surface\n" +
                "d) A large body of water\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("You are rigth a) A layer of gases in the atmosphere that protects us from UV radiation is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option a) A layer of gases in the atmosphere that protects us from UV radiation is rigth answer");
            wrong++;
        }
        System.out.println("Q8:What is the process of wearing down rocks and soil by wind, water, and ice?\n" +
                "\n" +
                "Options:\n" +
                "a) Weathering\n" +
                "b) Erosion\n" +
                "c) Deposition\n" +
                "d) Plate tectonics\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("You are rigth  a) Weathering is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option  a) Weathering is rigth answer");
            wrong++;
        }
        System.out.println("Q9:What is a natural disaster caused by the shaking of the Earth's surface?\n" +
                "\n" +
                "Options:\n" +
                "a) Hurricane\n" +
                "b) Tornado\n" +
                "c) Earthquake\n" +
                "d) Flood\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='c')
        {
            System.out.println("You are rigth c) Earthquake is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option c) Earthquake is rigth answer");
            wrong++;
        }
        System.out.println("Q10:What is the study of Earth and its rocks, minerals, and landforms?\n" +
                "\n" +
                "Options:\n" +
                "a) Biology\n" +
                "b) Chemistry\n" +
                "c) Physics\n" +
                "d) Geology\n" +
                "\n\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='d')
        {
            System.out.println("You are rigth d) Geology is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong option d) Geology is rigth answer");
            wrong++;
        }
        System.out.println("Total Correct :"+rigth+"\nTotal Wrong :"+wrong);
    }
    public static  void normalMode()
    {
        Scanner select=new Scanner(System.in);
        char optionChoosed;
        int rigth=0,wrong=0;
        System.out.println("\t\"YOU HAVE SELECTED Normal MODE\"\nChoose the right Answer:");
        System.out.println("Q1:What is the primary function of the CPU's ALU (Arithmetic Logic Unit)?\n" +
                "a) Store data\n" +
                "b) Perform mathematical and logical operations\n" +
                "c) Control the flow of data\n" +
                "d) Manage input/output devices\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("Correct! Option b) Perform mathematical and logical operations is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! b) Perform mathematical and logical operations is rigth answer");
            wrong++;
        }
        System.out.println("Q2:What is the difference between RAM and ROM?\n" +
                "a) RAM is volatile, ROM is non-volatile\n" +
                "b) RAM is slower, ROM is faster\n" +
                "c) RAM is used for storage, ROM is used for processing\n" +
                "d) RAM is read-only, ROM is read-write\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("Correct! a) RAM is volatile, ROM is non-volatile is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! a) RAM is volatile, ROM is non-volatile is rigth answer");
            wrong++;
        }
        System.out.println("Q3:Which type of memory is typically faster: RAM or cache?\n" +
                "a) RAM\n" +
                "b) Cache\n" +
                "c) They have the same speed\n" +
                "d) Depends on the specific hardware\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("Correct! b) Cache is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! b) Cache is rigth answer");
            wrong++;
        }
        System.out.println("Q4:What is the purpose of a network interface card (NIC)?\n" +
                "a) To process graphics\n" +
                "b) To control the mouse and keyboard\n" +
                "c) To connect a computer to a network\n" +
                "d) To store data on a hard drive\n" +
                "ENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='c')
        {
            System.out.println("Correct! c) To connect a computer to a network is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! c) To connect a computer to a network is rigth answer");
            wrong++;
        }
        System.out.println("Q5:What is the difference between a compiler and an interpreter?\n" +
                "a) A compiler translates code into machine language all at once, while an interpreter translates it line by line.\n" +
                "b) A compiler executes code directly, while an interpreter translates it first.\n" +
                "c) A compiler is used for high-level languages, while an interpreter is used for low-level languages.\n" +
                "d) They both perform the same function.\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("Correct!  a) A compiler translates code into machine language all at once, while an interpreter translates it line by line is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong!  a) A compiler translates code into machine language all at once, while an interpreter translates it line by line  is rigth answer");
            wrong++;
        }
        System.out.println("Q6:What is a Trojan horse?\n" +
                "a) A type of virus that replicates itself\n" +
                "b) A malicious program disguised as legitimate software\n" +
                "c) A program that encrypts files and demands a ransom\n" +
                "d) A network attack that floods a server with traffic\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("Correct! b) A malicious program disguised as legitimate software is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong!  b) A malicious program disguised as legitimate software is rigth answer");
            wrong++;
        }
        System.out.println("Q7:What is phishing?\n" +
                "a) A technique used to steal personal information\n" +
                "b) A type of computer virus\n" +
                "c) A method for speeding up internet connections\n" +
                "d) A way to prevent malware infections\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("Correct! a) A technique used to steal personal information is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! a) A technique used to steal personal information is rigth answer");
            wrong++;
        }
        System.out.println("Q8:What is the function of a DNS server?\n" +
                "a) To translate domain names into IP addresses\n" +
                "b) To store web pages\n" +
                "c) To encrypt internet traffic\n" +
                "d) To control the flow of data on a network\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("Correct! a) To translate domain names into IP addresses is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! a) To translate domain names into IP addresses is rigth answer");
            wrong++;
        }
        System.out.println("Q9:What is the difference between HTTP and HTTPS?\n" +
                "a) HTTP is secure, HTTPS is not\n" +
                "b) HTTPS is secure, HTTP is not\n" +
                "c) They are both equally secure\n" +
                "d) HTTP is used for email, HTTPS is used for web browsing\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='b')
        {
            System.out.println("Correct! b) HTTPS is secure, HTTP is not| is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! b) HTTPS is secure, HTTP is not is rigth answer");
            wrong++;
        }
        System.out.println("Q10:What is the purpose of a firewall?\n" +
                "a) To monitor network traffic and block unauthorized access\n" +
                "b) To speed up internet connections\n" +
                "c) To create backups of files\n" +
                "d) To scan for viruses on a computer\nENTER HERE:");
        optionChoosed=select.next().charAt(0);
        if(optionChoosed=='a')
        {
            System.out.println("Correct! a) To monitor network traffic and block unauthorized access is rigth answer");
            rigth++;
        }
        else
        {
            System.out.println("Wrong! a) To monitor network traffic and block unauthorized access is rigth answer");
            wrong++;
        }
        System.out.println("Total Correct :"+rigth+"\nTotal Wrong :"+wrong);
    }
    public static void hardMode() {
        Scanner select = new Scanner(System.in);
        char optionChoosed;
        int right = 0, wrong = 0;
        System.out.println("\t\"YOU HAVE SELECTED HARD MODE\"\nChoose the right Answer:");

        System.out.println("Q1: What is the name of the largest ocean on Earth by volume?");
        System.out.println("\na) Atlantic Ocean");
        System.out.println("\nb) Pacific Ocean");
        System.out.println("\nc) Indian Ocean");
        System.out.println("\nd) Arctic Ocean");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'b') {
            System.out.println("Correct! b) Pacific Ocean is the largest ocean by volume");
            right++;
        } else {
            System.out.println("Wrong! b) Pacific Ocean is the largest ocean by volume");
            wrong++;
        }

        System.out.println("Q2: What is the name of the hottest planet in our solar system?");
        System.out.println("\na) Mercury");
        System.out.println("\nb) Venus");
        System.out.println("\nc) Earth");
        System.out.println("\nd) Mars");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'b') {
            System.out.println("Correct! b) Venus is the hottest planet");
            right++;
        } else {
            System.out.println("Wrong! b) Venus is the hottest planet");
            wrong++;
        }

        System.out.println("Q3: What is the process of converting water vapor directly into ice without passing through the liquid state?");
        System.out.println("\na) Evaporation");
        System.out.println("\nb) Condensation");
        System.out.println("\nc) Sublimation");
        System.out.println("\nd) Precipitation");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'c') {
            System.out.println("Correct! c) Sublimation is the correct answer");
            right++;
        } else {
            System.out.println("Wrong! c) Sublimation is the correct answer");
            wrong++;
        }

        System.out.println("Q4: What is the Richter scale used to measure?");
        System.out.println("\na) Temperature");
        System.out.println("\nb) Wind speed");
        System.out.println("\nc) Earthquake magnitude");
        System.out.println("\nd) Precipitation levels");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'c') {
            System.out.println("Correct! c) Earthquake magnitude is measured by the Richter scale");
            right++;
        } else {
            System.out.println("Wrong! c) Earthquake magnitude is measured by the Richter scale");
            wrong++;
        }

        System.out.println("Q5: What is the process by which plants convert sunlight into energy?");
        System.out.println("\na) Respiration");
        System.out.println("\nb) Photosynthesis");
        System.out.println("\nc) Transpiration");
        System.out.println("\nd) Decomposition");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'b') {
            System.out.println("Correct! b) Photosynthesis is the process of converting sunlight into energy by plants");
            right++;
        } else {
            System.out.println("Wrong! b) Photosynthesis is the process of converting sunlight into energy by plants");
            wrong++;
        }

        System.out.println("Q6: What is the name of the supercontinent that existed millions of years ago?");
        System.out.println("\na) Gondwana");
        System.out.println("\nb) Laurasia");
        System.out.println("\nc) Pangaea");
        System.out.println("\nd) Atlantis");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'c') {
            System.out.println("Correct! c) Pangaea is the name of the supercontinent");
            right++;
        } else {
            System.out.println("Wrong! c) Pangaea is the name of the supercontinent");
            wrong++;
        }

        System.out.println("Q7: What is the layer of the Earth's atmosphere that contains the ozone layer?");
        System.out.println("\na) Troposphere");
        System.out.println("\nb) Stratosphere");
        System.out.println("\nc) Mesosphere");
        System.out.println("\nd) Thermosphere");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'b') {
            System.out.println("Correct! b) Stratosphere contains the ozone layer");
            right++;
        } else {
            System.out.println("Wrong! b) Stratosphere contains the ozone layer");
            wrong++;
        }

        System.out.println("Q8: What is the process of wearing down rocks and soil by wind, water, and ice called?");
        System.out.println("\na) Weathering");
        System.out.println("\nb) Erosion");
        System.out.println("\nc) Deposition");
        System.out.println("\nd) Subduction");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'a') {
            System.out.println("Correct! a) Weathering is the process of wearing down rocks and soil");
            right++;
        } else {
            System.out.println("Wrong! a) Weathering is the process of wearing down rocks and soil");
            wrong++;
        }

        System.out.println("Q9: What is the term for the slow movement of Earth's continents over geological time?");
        System.out.println("\na) Continental drift");
        System.out.println("\nb) Plate tectonics");
        System.out.println("\nc) Mountain building");
        System.out.println("\nd) Volcanic activity");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'b') {
            System.out.println("Correct! b) Plate tectonics describes the slow movement of Earth's continents");
            right++;
        } else {
            System.out.println("Wrong! b) Plate tectonics describes the slow movement of Earth's continents");
            wrong++;
        }

        System.out.println("Q10: What is the name of the Earth's inner core?");
        System.out.println("\na) Crust");
        System.out.println("\nb) Mantle");
        System.out.println("\nc) Outer core");
        System.out.println("\nd) Inner core");
        System.out.println("ENTER HERE:");
        optionChoosed = select.next().charAt(0);
        if (optionChoosed == 'd') {
            System.out.println("Correct! d) Inner core is the name of Earth's innermost layer");
            right++;
        } else {
            System.out.println("Wrong! d) Inner core is the name of Earth's innermost layer");
            wrong++;
        }
        System.out.println("Total Correct :"+right+"\nTotal Wrong :"+wrong);
    }
    public static void main(String[] args) {
        Scanner select=new Scanner(System.in);
        System.out.println("\t\"Welcome To Quiz Game\"");
        System.out.print("Select the difficulty Level:\n");
        System.out.print("1)\"Easy(1-10:Questions-Geological)\"\t\t2)\"Normal(1-10:Basedon Computer)\"" +
                "\n3)\"Hard(1-30:Questions-4-Options)\"\t\t4)\"Quit\"\nENTER HERE:");
        int choose=select.nextInt();
        switch (choose)
        {
            case 1:
            {
                easyMode();
                break;
            }
            case 2:
            {
                normalMode();
                break;
            }
            case 3:
            {
                hardMode();
                break;
            }
            case 4:
            {
                System.out.println("You have Exited the program");
                break;
            }
        }
    }
}
