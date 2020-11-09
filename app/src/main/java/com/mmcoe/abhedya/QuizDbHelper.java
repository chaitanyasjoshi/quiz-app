package com.mmcoe.abhedya;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mmcoe.abhedya.QuizContract.*;

import java.util.ArrayList;

class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "testquestions.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db =db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER," +
                QuestionTable.COLUMN_IMAGE + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("In day to day life Odometer measures", "Distance", "Odour", "Speed", "Pressure", 1, "1");
        addQuestion(q1);
        Question q2 = new Question("Name of Mr. Bean’s car", "Leyland Mini", "Hillman Minx", "Super Minx", "Austin Hereford", 1, "2");
        addQuestion(q2);
        Question q3 = new Question("Which Brand has launched Ethanol powered bike in India", "KTM", "Honda", "Suzuki", "TVS", 4, "3");
        addQuestion(q3);
        Question q4 = new Question("Which is recently launched electric motorbike in India which is made in collaboration with Chinese bike manufacturer Super Soco?", "Revolt 400", "Evolet hawk", "Hero optima", "Ather 340", 1, "4");
        addQuestion(q4);
        Question q5 = new Question("Which was the first car to enter the space ?", "Tesla model T", "Tesla roadster", "Tesla model 3", "Tesla model S ", 2, "5");
        addQuestion(q5);
        Question q6 = new Question("Which was the first electric  passenger car to be launched  in India ?","Mahindra Reva", "Huyundai Kona", "Mahindra e20", "Toyota Prius", 1, "6");
        addQuestion(q6);
        Question q7 = new Question("Which was the first Ferrari car  to be produced ?","Ferrari 125s","Zagato panoramica","Laferrari","Daytona competizione",1, "7");
        addQuestion(q7);
        Question q8 = new Question("Which was the company that produced the most iconic Indian car “Ambassador”?","Premier","Fiat","Hindustan motors","ICML motors",3,"8");
        addQuestion(q8);
        Question q9 = new Question("Which is parent company of famous motorbike producer “Ducati”?","Volkswagen","Mercedez benz","Ferrari","BMW",1,"9");
        addQuestion(q9);
        Question q10 = new Question("Which is the parent company of Porsche?","Volkswagen","Toyota","Tata","Skoda",2,"10");
        addQuestion(q10);
        Question q11 = new Question("Who has won the most world championships in MOTO GP?","Giacomo Agostini","Angel Nieto","Valentino Rossi","Mike Hailwood",3,"11");
        addQuestion(q11);
        Question q12 = new Question("Who invented the first car?","Karl Benz","Enzo Ferrari","Giovanni Agnelli (FIAT)","Henry Lelamd (Cadillac)",1,"12");
        addQuestion(q12);
        Question q13 = new Question("Who is the first person in history to drive an automobile over long distance?","Karl Benz","Henry Ford","Bertha Benz","Louis Chevrolet",3,"13");
        addQuestion(q13);
        Question q14 = new Question("How many gears does an F1 car have?","5","6","7","8",4,"14");
        addQuestion(q14);
        Question q15 = new Question("What is full form of ABS, a safety technology used in cars and bikes?","All lock Braking System","Anti-lock Braking System","Anti –Brake lock system","All Brakes locking system",3,"15");
        addQuestion(q15);
        Question q16 = new Question("ESP keeps your car safely on track. ESP stands for?","Electric Stability Program","Electronics Stabilising Pulse","Extra Safety Program","Electronic Stability Program",4,"16");
        addQuestion(q16);
        Question q17 = new Question("Maserati, Alfa Romeo, Lancia are subsidiaries of which car maker","Chrysler","Fiat","Peugeot","Renault",2,"17");
        addQuestion(q17);
        Question q18 = new Question("Which is the car shown in the picture above?(Dil chahta hain )","Mercedes benz 300 SL","Mercedes benz 350 XL","Mercedes benz 450 SL","Mercedes benz 500 XL",1,"18");
        addQuestion(q18);
        Question q19 = new Question("Which is the car shown in the picture above from movie ZNMD?","Buick Convertible Pro","Buick Super Convertible","Buick Cascada","Buick Regal Grand National",2,"19" );
        addQuestion(q19);
        Question q20 = new Question("What is full form of DRS in F1?","Drag removal system","Drag reduction system","Drift reduction system","Drift removal system",2,"20");
        addQuestion(q20);
        Question q21 = new Question("The famous 24 hours race is held at?","Indianapolis","Rome","Le mans","Monaco",3,"21");
        addQuestion(q21);
        Question q22 = new Question("Who won the F1 world championship in 2018?","Lewis Hamilton","Sebastian Vettel","Michael Schumacher","Kimi Raikkonnen",1,"22");
        addQuestion(q22);
        Question q23 = new Question("What is the name of the Michelin Man?","Addendum ","Bibendum","Cedendum","Dedendum",2,"23");
        addQuestion(q23);
        Question q24 = new Question("Where is the Dakar Rally scheduled to be held in the year of 2020?","Morocco","Senegal","Madagascar","Saudi Arabia",4,"24");
        addQuestion(q24);
        Question q25 = new Question("Which is the colour that has been claimed to have the darkest existing on a car?","Santablack","Vantablack","Flantablack","Plantablack",2,"25");
        addQuestion(q25);
        Question q26 = new Question("What is the most significant feature of Lamborghini Diablo VT ","Exclusive Refrigertor ","4WD","7- inch UHD tablet","Alternately solar powered ",2,"26");
        addQuestion(q26);
        Question q27 = new Question("What is the name of Volkswagen’s AWD technology? ","4drive","4motion","Quattro","Alldrive",2,"27");
        addQuestion(q27);
        Question q28 = new Question("What does the R stand for in the name WagonR? ","Recreation","Restoration","Reverberation","Revelation",1,"28");
        addQuestion(q28);
        Question q29 = new Question("Which famous Auto company is named after the Latin word for ‘Listen’?","Mercedes","Chevrolet","Audi","Toyota",3,"29");
        addQuestion(q29);
        Question q30 = new Question("Which type of gear is primarily used in a car differential? ","Spur gear","Helical Gear ","Bevel Gear ","Worm gear ",3,"30");
        addQuestion(q30);
        Question q31 = new Question("Who invented seat belts? ","George Cayley ","Karl Benz","Tom Underwood","Otto Lilienthal ",1,"31");
        addQuestion(q31);
        Question q32 = new Question("What is the name of the premium petrol offered by Bharat Petroleum?","Power","Speed","Xtra Premium","V-Power",2,"32");
        addQuestion(q32);
        Question q33 = new Question("Chevrolet is an American automobile division of which company?","Volkswagen","General Motors ","Daimler AG","Ford Motors ",2,"33");
        addQuestion(q33);
        Question q34 = new Question("What are ‘Air Dams’?","Spoilers at front of vehicle","Spoilers at rear of vehicle","Spoilers at sides of vehicle","Spoilers at top of vehicle",2,"34");
        addQuestion(q34);
        Question q35 = new Question("How many Cells are used in a 12 volt car battery?","2","4","6","8",3,"35");
        addQuestion(q35);
        Question q36 = new Question("Damper in an Automobile is used to…","Absorb the energy ","Dissipate the energy","Release the energy","Decrease the energy ",1,"36");
        addQuestion(q36);
        Question q37 = new Question("Tyre Rotation is generally done at? ","1000 kms","4000 kms","7500 kms","10000 kms",4,"37");
        addQuestion(q37);
        Question q38 = new Question("In 4 wheel drive (4WD), the number of gear boxes are","1","2","3","4",2,"38");
        addQuestion(q38);
        Question q39 = new Question("Which was the first car to break the sound barrier?","Thrust SSC","Hennessey Venom GT","Buggatti Veyron ","Koenigsegg Agera R ",1,"39");
        addQuestion(q39);
        Question q40 = new Question("Inventor of cruise control was……","Bedridden man ","Blind man","Robot","Paralyzed man",2,"40");
        addQuestion(q40);
        Question q41 = new Question("What is Toyota’s luxury divison called as? ","Infiniti","Volvo","Acura ","Lexus",4,"41");
        addQuestion(q41);
        Question q42 = new Question("What are special performance editions of Honda cars called?","Type D","Type R","Type M ","Type A",2,"42");
        addQuestion(q42);
        Question q43 = new Question("What is loosely defined as the mass between the road and the suspension springs?","Unsprung mass","Sprung mass ","Spring mass","Unspring mass ",1,"43");
        addQuestion(q43);
        Question q44 = new Question("What is the final process in the four-stroke cycle?","Throttle","Exhaust","Ignite","Rinse",2,"44");
        addQuestion(q44);
        Question q45 = new Question("Who is the CEO of Tata Motors?","Cyrus Mistry ","Guenter Butschek","Ratan Tata ","Nataranjan Chandrasekaran",2,"45");
        addQuestion(q45);
        Question q46 = new Question("Who is the owner of MG Motors ?","Nanjing Automobile ","Lotus","Saic Motors ","Changan Automobile ",3,"46");
        addQuestion(q46);
        Question q47 = new Question("Which driver lost his life recently in a racing mishap in Formula 2 this year?","Jules Bianchi ","Max Chilton ","Anthoine Hubert","Maria de Villota ",3,"47");
        addQuestion(q47);
        Question q48 = new Question("What is the full form of NASCAR?","National Agency for Stalk Car Auto Racing","National Association for Stock Car Auto Racing","Nationwide Association of Stalk Car Auto Racing ","Nationwide Agency of Stock Car Auto Racing ",2,"48");
        addQuestion(q48);
        Question q49 = new Question("Which is the following car which was used in 3 Idiots? ","Volvo XC60","Volvo XC90","Volvo XC40","Volvo S60 ",2,"49");
        addQuestion(q49);
        Question q50 = new Question("Which is this car which is used as common taxi in New York? ","Ford Crown Victoria","Ford Fusion ","Ford Corina ","Ford C-max",1,"50");
        addQuestion(q50);
    }

    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_IMAGE, question.getimage());
        db.insert(QuestionTable.TABLE_NAME,null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionTable.TABLE_NAME, null);

        if(c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setimage(c.getString(c.getColumnIndex(QuestionTable.COLUMN_IMAGE)));
                questionList.add(question);
            }while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
