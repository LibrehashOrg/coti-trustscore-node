package io.coti.trustscore.config.rules;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "range")
public class Range {
    @XmlElement(name = "from")
    private int from;
    @XmlElement(name = "to")
    private int to;
}
