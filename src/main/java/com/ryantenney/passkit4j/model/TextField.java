package com.ryantenney.passkit4j.model;

import java.util.Set;

import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true, fluent=true)
@NoArgsConstructor
@RequiredArgsConstructor
public class TextField implements Field<String> {

    @NonNull private String key;
    private String label;
    private String changeMessage;
    private TextAlignment textAlignment;
    private Set<DataDetectorType> dataDetectorTypes;
    private String attributedValue;
        // Added so support "Additional Row Support".  See slide with
	// same title in:
	// https://devstreaming-cdn.apple.com/videos/wwdc/2018/720gofzcqcp431kcasf/720/720_wallet_and_apple_pay_creating_great_customer_experiences.pdf?dl=1
    private Integer row;

    @NonNull private String value;

    public TextField(String key, String label, String value) {
	this(key, value);
	this.label = label;
    }
    public TextField(String key, String label, String value, Integer row) {
	this(key, value);
	this.label = label;
	this.row = row;
    }

}
