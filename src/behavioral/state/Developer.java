package behavioral.state;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping)
            activity = new Training();
        else if (activity instanceof Training)
            activity = new Coding();
        else if (activity instanceof Coding)
            activity = new Reading();
        else if (activity instanceof Reading)
            activity = new Sleeping();
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
