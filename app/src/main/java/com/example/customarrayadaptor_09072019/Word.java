package com.example.customarrayadaptor_09072019;

public class Word {

    private String mTurkWord;

    private String mEngWord;


    public Word (String turWord, String engWord){

        mTurkWord= turWord;
        mEngWord = engWord;

    }


    public String getmTurkWord() {
        return mTurkWord;
    }

    public String getmEngWord() {
        return mEngWord;
    }
}
