public class calculations {

    public int calculation(int age, int income, int income_Tax) {
        if (age < 60) {
            if (income > 250000) {
                income_Tax = 0;
            }
            if (250001 < income && income < 500000) {
                income_Tax = income * 5 / 100;
            }
            if (500001 < income && income < 1000000) {
                income_Tax = 12500 + (income * 20 / 100);
            }
            if (1000000 < income) {
                income_Tax = 112500 + (income * 30 / 100);
            }
        }

        if (60 < age & age > 80) {
            if (income > 300000) {
                income_Tax = 0;
            }
            if (300001 < income && income < 500000) {
                income_Tax = income * 5 / 100;
            }
            if (500001 < income && income < 1000000) {
                income_Tax = 10000 + (income * 20 / 100);
            }
            if (1000000 < income) {
                income_Tax = 110000 + (income * 30 / 100);
            }
        }

        if (age > 80) {
            if (income > 500000) {
                income_Tax = 0;
            }

            if (500001 < income && income < 1000000) {
                income_Tax = income * 20 / 100;
            }
            if (1000000 < income) {
                income_Tax = 100000 + (income * 30 / 100);
            }
        }
        return income_Tax;
    }
}