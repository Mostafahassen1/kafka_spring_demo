package KafkaApplicationDemo.KafkaApplication.listenerKafkaTopic;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "MostafaHussien" ,
            groupId = "TeamZero "
    )
    void listener(String data){
        System.out.println("Listener Data : " + data );
    }
}
