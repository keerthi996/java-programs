class EnumExample{
    enum WeekDays{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
    public static void main(String args[]){
        for(WeekDays x:WeekDays.values()){
            System.out.println(x);
        }
    }
}