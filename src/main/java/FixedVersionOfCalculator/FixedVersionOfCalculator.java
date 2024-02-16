package FixedVersionOfCalculator;

class FixedVersionOfCalculator {
    private int result;

    public FixedVersionOfCalculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        this.result -= value;
    }

    public void multiply(int value) {
        this.result *= value;
    }

    public void exponent(int value) {
        for(int i=1; i<value; i++) {
            multiply(this.result);
        }
    }
}