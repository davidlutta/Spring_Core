package com.BlackManta.spring.refTypes;

public class Scores {
    private Double mathScore;
    private Double englishScores;
    private Double swahiliScores;

    public Double getMathScore() {
        return mathScore;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    public Double getEnglishScores() {
        return englishScores;
    }

    public void setEnglishScores(Double englishScores) {
        this.englishScores = englishScores;
    }

    public Double getSwahiliScores() {
        return swahiliScores;
    }

    public void setSwahiliScores(Double swahiliScores) {
        this.swahiliScores = swahiliScores;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "mathScore=" + mathScore +
                ", englishScores=" + englishScores +
                ", swahiliScores=" + swahiliScores +
                '}';
    }
}
