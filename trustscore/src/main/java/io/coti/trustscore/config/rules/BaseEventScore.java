package io.coti.trustscore.config.rules;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "standardEventScore")
public class BaseEventScore extends EventScore {
    @XmlElement(name = "definition")
    private String definition;
    @XmlElement(name = "term")
    private int term;
}
