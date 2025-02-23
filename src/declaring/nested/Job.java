package declaring.nested;

public interface Job {

    void runJob();

    class EmptyJob implements Job {
        // No se permite crear al exterior crear instancias de este objeto
        private EmptyJob() {}

        @Override
        public void runJob() {
            System.out.println("Nada importante que ejecutar...");
        }
    }

    // Un campo constante
    Job EMPTY_JOB = new EmptyJob();

}

class JobTest {

    public static void main(String[] args) {
        sumbitJob(Job.EMPTY_JOB);
    }

    static void sumbitJob(Job job) {
        job.runJob();
    }
}
