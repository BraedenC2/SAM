public class Response{
    static Voice voice = new Voice();
    static String userTexts;
    public String reply(String userText) {

        userTexts = userText;

        String respond = "";


        String[] answers = random(userVocab(userTexts));
        int index = (int) (Math.random() * answers.length);
        respond = answers[index];
        voice.voiceBox(respond);
        voice.voiceBox(" ");
        return respond;
    }

    private static String[] random(int selection) {

        String[] r0 = {
                "mhm.",
                "Okay.",
                "I see.",
                "Mhm, I understand.",
                "I see what you're saying.",
                "Okay, go on.",
                "Hmm, interesting.",
                "I'm listening.",
                "Tell me more.",
                "I'm here to listen.",
                "Go ahead, I'm all ears.",
                "I'm paying attention.",
                "Please continue.",
                "I'm with you.",
                "Keep talking.",
                "I'm here for you.",
                "I'm following along.",
                "I'm taking it all in.",
                "You have my full attention.",
                "I'm here to hear you out.",
                "I'm focused on what you're saying.",
                "I'm here to listen and support.",
                "Feel free to share more."};
        String[] r1 = {
                "Greetings.",
                "Welcome.",
                "Hello.",
                "Good Morning.",
                "Good Afternoon.",
                "Good Evening.",
                "Nice to meet you.",
                "How are you?"};
        String[] r2 = {
                "I'm well, thank you.",
                "I'm doing great, thanks.",
                "I'm fine, how about you?",
                "I'm good, thanks for asking.",
                "I'm doing well, how are you?",
                "I'm okay, thanks for checking.",
                "I'm not too bad, how about yourself?",
                "I'm pretty good, thanks.",
                "I'm doing fine, thanks for inquiring.",
                "I'm well, and you?",
                "I'm doing alright, thanks.",
                "I'm not too shabby, how about you?",
                "I'm good, and you?",
                "I'm doing well, and yourself?",
                "I'm fine, and you?",
                "I'm well, thank you for asking.",
                "I'm good, how are things on your end?",
                "I'm doing great, and you?",
                "I'm well, and I hope you are too.",
                "I'm fine, and it's nice to see you.",
                "I'm doing well, thanks for your concern.",
                "I'm good, and it's good to see you.",
                "I'm alright, and you?",
                "I'm well, and I hope you're doing well too.",
                "I'm fine, and I appreciate your asking.",
                "I'm doing well, and it's a pleasure to see you."};
        String[] r3 = {
                "Of course, I'd be pleased to assist you with the conversion task. Type system:convert.",
                "Certainly, I can help you with the conversion. Please provide me with the details. Type system:convert.",
                "I'm here to assist. Could you kindly specify the conversion you require? Type system:convert.",
                "I'm at your service. Please share the details of the conversion you need. Type system:convert.",
                "Certainly, I can guide you through the process of converting. What do you need to convert? Type system:convert.",
                "I'd be happy to help you with the conversion. Could you please provide more information? Type system:convert.",
                "I'm here to assist you. Could you provide more context about the conversion you're working on? Type system:convert.",
                "Of course, I can assist you in converting. Please let me know the specifics. Type system:convert.",
                "I'm available to help with the conversion task. Could you provide further details? Type system:convert.",
                "Absolutely, I can assist with the conversion. Please share the necessary information. Type system:convert.",
                "I'm here to assist you with the conversion. Could you kindly explain what needs to be converted? Type system:convert.",
                "I'd be glad to help you with the conversion. Can you provide more details? Type system:convert.",
                "Certainly, I can assist with the conversion task. Please specify what you're converting. Type system:convert.",
                "I'm available to guide you through the conversion process. What would you like to convert? Type system:convert.",
                "Of course, I can assist you with the conversion. Could you share the details of the task? Type system:convert.",
                "I'm here to help. Could you provide more information about the conversion you need? Type system:convert.",
                "I'd be happy to assist with the conversion. Please provide me with the necessary details. Type system:convert.",
                "Certainly, I can help with the conversion task. What specifically would you like to convert? Type system:convert.",
                "I'm at your service. Please share the details of the conversion you have in mind. Type system:convert.",
                "Of course, I can assist you in converting. What do you need to convert? Type system:convert.",
                "I'd be delighted to help with the conversion. Could you please provide more information? Type system:convert.",
                "Certainly, I can assist with the conversion. Please provide further details. Type system:convert.",
                "I'm here to assist you. Could you share more context about the conversion you're working on? Type system:convert."};
        String[] r4 = {
                "I'm glad to hear that.",
                "That's wonderful!",
                "Great to know.",
                "I'm happy for you.",
                "You sound in good spirits.",
                "Fantastic!",
                "Excellent!",
                "Superb!",
                "You're doing great.",
                "I'm pleased to hear it.",
                "I'm thrilled!",
                "That's fantastic news.",
                "You're on a roll.",
                "Keep up the good work.",
                "You're on top of the world!",
                "That's terrific!",
                "Outstanding!",
                "You're doing exceptionally well.",
                "Magnificent!",
                "Keep that positivity going!",
                "You're doing superbly!",
                "Top-notch!",
                "Impressive!",
                "Prime performance!",
                "You're truly exceptional.",
                "Stellar!"
        };

        String[] r5 = {
                "I'm sorry to hear that.",
                "That's tough, I'm here for you.",
                "I understand how you feel.",
                "It's okay to feel this way, we all have rough moments.",
                "You're not alone, I'm here to support you.",
                "Let's talk about it, sometimes sharing helps.",
                "I'm here to listen if you want to talk.",
                "Take a deep breath, things will get better.",
                "Remember, there's light at the end of the tunnel.",
                "It's okay to reach out for help when you're feeling this way.",
                "You're stronger than you think, you'll get through this.",
                "I'm here to offer a listening ear and support.",
                "Take care of yourself, self-care is important during tough times.",
                "Reach out to friends and loved ones, they care about you.",
                "I'm sending positive thoughts your way.",
                "Sometimes, it helps to focus on the little things that bring comfort.",
                "Remember that emotions are temporary, and this too shall pass.",
                "Lean on your support network, they're there for you.",
                "Don't be too hard on yourself, it's okay to have difficult moments.",
                "You've faced challenges before, and you can overcome this one too."
        };

        String[] systemPowers = {
                userTexts + " is now activated. The process is now activated.",
                userTexts + " is now activated. Your request has been activated.",
                userTexts + " is now activated. Activation is complete.",
                userTexts + " is now activated. The system is now active.",
                userTexts + " is now activated. The feature is now enabled.",
                userTexts + " is now activated. Your command has been executed.",
                userTexts + " is now activated. Activation successful.",
                userTexts + " is now activated. Task activated successfully.",
                userTexts + " is now activated. The function has been initiated.",
                userTexts + " is now activated. Your request is now active.",
                userTexts + " activated. Activation complete.",
                userTexts + " activated. Process activated successfully.",
                userTexts + " activated. The system is now operational.",
                userTexts + " activated. Feature enabled.",
                userTexts + " activated. Command executed successfully.",
                userTexts + " activated. Activation confirmed.",
                userTexts + " activated. Task initiated.",
                userTexts + " activated. Request is now active."
        };

        String[] error = {
                "."
        };

        return switch (selection) {
            case -2 -> systemPowers;
            case -1 -> error;
            case 1 -> r1;
            case 2 -> r2;
            case 3 -> r3;
            case 4 -> r4;
            case 5 -> r5;
            default -> r0;
        };
    }

    public static int userVocab(String userText){
        String[] r1 = {
                "greetings.",
                "welcome.",
                "hello.",
                "good morning.",
                "good afternoon.",
                "good evening.",
                "hi.",
                "hey.",
                "howdy.",
                "hi there.",
                "yo!",
                "hiya!",
                "hey there!",
                "nice to meet you.",
                "long time no see.",
                "what's new?",
                "hey, how are you doing?",
                "hey, what's up?"};

        String[] r2 = {
                "how are you doing?",
                "how's it going?",
                "how are things?",
                "how's everything with you?",
                "how's your day?",
                "how's your day been?",
                "how are you feeling?",
                "how have you been?",
                "what's new?",
                "how's life treating you?",
                "how's it hanging?",
                "how's your week going?",
                "how's your day going so far?",
                "how are you today?",
                "how are you holding up?",
                "how's your health?",
                "how's your mood?",
                "how's your spirit?",
                "how's your energy?",
                "how's your state of mind?",
                "how are you?"};

        String[] r3 = {
                "i need you to convert something for me.",
                "hello, i would like to convert something.",
                "i would like to convert something.",
                "open converter.",
                "can you convert something for me?",
                "hey, can you help me convert something real quick?",
                "i need a hand with this conversion, mind giving me a hand?",
                "could you do me a favor and convert something for me?",
                "let's open up that converter tool, shall we?",
                "hey, can you show me how to convert this thing?",
                "got a sec? i need to convert something. can you assist?",
                "i'm trying to convert something here, mind pitching in?",
                "open that converter, please. i've got something to convert.",
                "can you do a quick conversion for me?",
                "i'm looking to convert something.",
                "hey, can you help me with a conversion?",
                "mind helping me out with a conversion task?",
                "hey there, i could use your expertise in converting something.",
                "could you quickly convert this for me?",
                "got a moment? i need you to convert something for me.",
                "i'm trying to figure out this conversion. can you assist?",
                "hey, can you guide me through this conversion?",
                "mind showing me how to do this conversion?",
                "i'm stumped with this conversion. can you help?",
                "can you walk me through the process of converting this?",
                "i need to convert something. can you show me the ropes?",
                "let's tackle this conversion together, shall we?",
                "i'm looking for some help with a quick conversion."
        };

        String[] r4 = {
                "i'm ready.",
                "i'm here.",
                "i'm good.",
                "i'm all right.",
                "i'm great.",
                "i'm fantastic.",
                "i'm excellent.",
                "i'm superb.",
                "i'm wonderful.",
                "i'm awesome.",
                "i'm splendid.",
                "i'm marvelous.",
                "i'm terrific.",
                "i'm outstanding.",
                "i'm phenomenal.",
                "i'm incredible.",
                "i'm superb.",
                "i'm fantastic.",
                "i'm first-rate.",
                "i'm top-notch.",
                "i'm tip-top.",
                "i'm prime.",
                "i'm exceptional.",
                "i'm magnificent.",
                "i'm fabulous.",
                "i'm remarkable.",
                "i'm stellar.",
                "i'm content.",
                "i'm satisfied.",
                "i'm pleased.",
                "i'm cheerful.",
                "i'm delighted.",
                "i'm elated.",
                "i'm overjoyed.",
                "i'm ecstatic.",
                "i'm thrilled.",
                "i'm euphoric.",
                "i'm on cloud nine.",
                "i'm in high spirits.",
                "i'm in good spirits.",
                "i'm in a great mood.",
                "i'm on top of the world.",
                "i'm feeling wonderful.",
                "i'm feeling fantastic.",
                "i'm feeling terrific.",
                "i'm feeling superb.",
                "i'm feeling marvelous.",
                "i'm feeling incredible.",
                "i'm feeling phenomenal.",
                "i'm feeling outstanding.",
                "i'm feeling exceptional.",
                "i'm feeling magnificent.",
                "i'm feeling fabulous.",
                "i'm feeling remarkable.",
                "i'm feeling stellar.",
                "i'm feeling awesome.",
                "i'm feeling splendid.",
                "i'm feeling marvelous.",
                "i'm feeling terrific.",
                "i'm feeling superb.",
                "i'm feeling fantastic.",
                "i'm feeling first-rate.",
                "i'm feeling top-notch.",
                "i'm feeling tip-top.",
                "i'm feeling prime.",
                "i'm feeling exceptional.",
                "i'm feeling superb.",
                "i'm feeling fantastic.",

        };

        String[] r5 = {
                "i'm sad.",
                "i'm upset.",
                "i'm disappointed.",
                "i'm frustrated.",
                "i'm annoyed.",
                "i'm angry.",
                "i'm irritated.",
                "i'm stressed.",
                "i'm anxious.",
                "i'm worried.",
                "i'm overwhelmed.",
                "i'm exhausted.",
                "i'm drained.",
                "i'm tired.",
                "i'm miserable.",
                "i'm gloomy.",
                "i'm down.",
                "i'm depressed.",
                "i'm dejected.",
                "i'm despondent.",
                "i'm hopeless.",
                "i'm heartbroken.",
                "i'm devastated.",
                "i'm crushed.",
                "i'm in despair.",
                "i'm in agony.",
                "i'm in pain.",
                "i'm suffering.",
                "i'm in turmoil.",
                "i'm alright.",
                "i'm okay.",
                "eh.",
                "i'm decent."
        };

        String[] systemPowers = {
                "system:convert",
                "system:convert.",
        };

        String[] error = {
                "null"
        };

        for (String s : r1) {if (userText.equals(s)) {return 1;}}
        for (String s : r2) {if (userText.equals(s)) {return 2;}}
        for (String s : r3) {if (userText.equals(s)) {return 3;}}
        for (String s : r4) {if (userText.equals(s)) {return 4;}}
        for (String s : r5) {if (userText.equals(s)) {return 5;}}


        for (String s : systemPowers) {if (userText.equals(s)) {return -2;}}
        for (String s : error) {if (userText.equals(s)) {return -1;}}

        return 0;
    }

}
