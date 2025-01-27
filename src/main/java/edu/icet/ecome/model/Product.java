package edu.icet.ecome.model;

import lombok.*;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {

    private String name;
    private String vendor;
    private String category;
    private Double price;

}
