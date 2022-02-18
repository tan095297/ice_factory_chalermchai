package newton.ice.icefactory.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
// import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public class Event {
    
    
    private Integer amount ;

    @CreatedDate
    private Date createdAt;
}
