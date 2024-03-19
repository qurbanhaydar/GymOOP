public class Sports {
    private int burpee_count;
    private int squat_count;
    private int situp_count;
    private int pushup_count;

    public Sports(int burpee_count, int squat_count, int situp_count, int pushup_count) {
        this.burpee_count = burpee_count;
        this.squat_count = squat_count;
        this.situp_count = situp_count;
        this.pushup_count = pushup_count;
    }

    public int getBurpee_count() {
        return burpee_count;
    }

    public void setBurpee_count(int burpee_count) {
        this.burpee_count = burpee_count;
    }

    public int getSquat_count() {
        return squat_count;
    }


    public void setSquat_count(int squat_count) {
        this.squat_count = squat_count;
    }


    public int getSitup_count() {
        return situp_count;
    }

    public void setSitup_count(int situp_count) {
        this.situp_count = situp_count;
    }

    public int getPushup_count() {
        return pushup_count;
    }

    public void setPushup_count(int pushup_count) {
        this.pushup_count = pushup_count;
    }

    public void doExercise (String name, int count){
        String upperName = name.toUpperCase();
        if (name.equals("BURPEE")){
            doBurpee(count);
        } else if (name.equals("SQUAT")) {
            doSquat(count);
        } else if (name.equals("SITUP")) {
            doSitup(count);
        } else if (name.equals("PUSHUP")) {

            doPushup(count);
        }else {
            System.out.println("Wrong exercise type.. ");
        }
    }

    public void doBurpee(int count) {
        if (burpee_count == 0){
            System.out.println("You don't need to do this... ");
        }
        if (burpee_count-count<0) {
            System.out.println("Congrats. All done....");
            burpee_count = 0;
        }else {
            System.out.println("Congrats. U did " +count + " times" );

            burpee_count -= count;

            System.out.println("You need to do exercise more" + burpee_count + " times");
        }

    }
    public void doSquat(int count) {
        if (squat_count == 0){
            System.out.println("You don't need to do this... ");
        }
        if (squat_count - count < 0) {
            System.out.println("Congrats. All done....");
            squat_count = 0;
        }else {
            System.out.println("Congrats. U did " +count + " times" );

            squat_count -= count;

            System.out.println("You need to do exercise more" + squat_count + " times");
        }

    }
    public void doSitup(int count) {
        if (situp_count == 0){
            System.out.println("You don't need to do this... ");
        }
        if (situp_count-count<0) {
            System.out.println("Congrats. All done....");
            situp_count = 0;
        }else {
            System.out.println("Congrats. U did " +count + " times" );

            situp_count -= count;

            System.out.println("You need to do exercise more" + situp_count + " times");
        }

    }
    public void doPushup(int count) {
        if (pushup_count == 0){
            System.out.println("You don't need to do this... ");
        }
        if (pushup_count-count<0) {
            System.out.println("Congrats. All done....");
            pushup_count = 0;
        }else {
            System.out.println("Congrats. U did " +count + " times" );

            pushup_count -= count;

            System.out.println("You need to do exercise more" + pushup_count + " times");
        }

    }
    public boolean endOfExercise () {
        return (burpee_count == 0) && (squat_count == 0) && (situp_count == 0) && (pushup_count == 0);
    }

}



