package org.lld;


public class Main {
    public static void main(String[] args) {
        //User user = new User.UserBuilder().setUserName("fuck").setUserId("you").build();
        User user = User.builder().setUserName("fuck").setUserId("you").build();
        System.out.println(user.toString());

        //WorkerDetailsToPushOnFlatsPojo
          //      .builder()
            //    .workerName("FlatReactivationMetricWorker")
              //  .args(Arrays.asList(flat.getId()))
               // .build());
    }
}