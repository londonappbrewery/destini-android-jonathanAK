package com.londonappbrewery.destini;

public class CHAPTER {
    private boolean ending;
    private int story;
    private int ans1;
    private int ans2;
    private int path1;
    private int path2;

    public CHAPTER(boolean ending, int story, int ans1, int path1, int ans2, int path2) {
        this.ending = ending;
        this.story = story;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.path1 = path1;
        this.path2 = path2;
    }

    public boolean isEnding() {
        return ending;
    }

    public int getStory() {
        return story;
    }

    public int getAns1() {
        return ans1;
    }

    public int getAns2() {
        return ans2;
    }

    public int getPath1() {
        return path1;
    }

    public int getPath2() {
        return path2;
    }
}
