public class Date {

	public int year;
	public int month;
	public int day;

	public Date(int m, int d, int y) {

		year = y;
		month = m;
		day = d;

	}

	public int getYear() {
		if (year <= 3000 && year >= 1900) {
			return year;
		}
		return year;
	}

	public int getMonth() {
		if (month <= 12 && month >= 1) {

			return month;
		} else {
			return 0;
		}
	}

	public int getDay() {

		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12)
				&& day >= 1 && day <= 31) {
			return day;
		}

		else if ((month == 4 || month == 6 || month == 9 || month == 11)
				&& (day >= 1) && day <= 30) {
			return day;
		}

		else if (month == 2 && day >= 1 && day <= 28) {
			return day;
		}

		else if (month == 3 && day >= 1 && day <= 28) {
			return day;

		}

		else
			return 0;

	}

	public int dayOfYear() {
		int totalDays = 0;
		switch (month) {
		case 12:
			totalDays += 31;
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 30;
		case 6:
			totalDays += 31;
		case 5:
			totalDays += 30;
		case 4:
			totalDays += 31;
		case 3:
			totalDays += 28;
		case 2:
			totalDays += 31;
		}

		totalDays += day;
		return totalDays;
	}

	public int compare(Date dt) {
		int diff = Math.abs((dayOfYear() + 365 * year)
				- (dt.dayOfYear() + 365 * dt.year));
		int months = diff / 30;
		if (months > 60) {
			months = 60;
			// System.out.println(numMonths);
		}
		// System.out.println(numMonths);
		return months;
	}
}