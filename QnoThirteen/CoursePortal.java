class Course{
    private String title;
    private int duration;
    private String instructor;

    Course(String title, int duration, String instructor){
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    void getCourseInfo() {
        System.out.println(getTitle() + " is to be taught by " + getInstructor());
        System.out.println("Duration of the course : " + getDuration() + "years.");
    }
}

class LiveCourse extends Course{
    private String scheduleTime;

    LiveCourse(String title, int duration, String instructor, String scheduleTime){
      super(title, duration, instructor);
      this.scheduleTime = scheduleTime;
    }
    public String getScheduleTime() {
        return scheduleTime;
    }
    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    void getCourseInfo() {
        System.out.println(getTitle() + " is to be taught by " + getInstructor());
        System.out.println("Duration of the course : " + getDuration() + "years.");
        System.out.println("Scheduled time : " + getScheduleTime());
    }
}

class RecordedCourse extends Course{
        private int videoCount;
    
        RecordedCourse(String title, int duration, String instructor, int videoCount){
          super(title, duration, instructor);
          this.videoCount = videoCount;
        }
        public int getVideoCount() {
            return videoCount;
        }
        public void setVideoCount(int videoCount) {
            this.videoCount = videoCount;
        }
    
        @Override
        void getCourseInfo() {
            System.out.println(getTitle() + " is to be taught by " + getInstructor());
            System.out.println("Duration of the course : " + getDuration() + "years.");
            System.out.println("Video Count : " + getVideoCount());
        }
}


public class CoursePortal {
    public static void main(String[] args) {
        Course[] stu = new Course[2];
        stu[0] = new LiveCourse("BCSIT", 3, "Jimmy Neutron", "7am to 10am");
        stu[1] = new RecordedCourse("BIT", 4, "Timmy Beutron", 24);

        stu[0].getCourseInfo();
        System.out.println("");
        stu[1].getCourseInfo();
    }
}
