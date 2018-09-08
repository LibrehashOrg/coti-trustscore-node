package io.coti.trustscore.http;

import io.coti.basenode.data.TrustScoreData;
import io.coti.basenode.http.BaseResponse;
import lombok.Data;

@Data
public class SetKycTrustScoreResponse extends BaseResponse {
    private String userHash;
    private double trustScore;
    private double kycTrustScore;

    public SetKycTrustScoreResponse(TrustScoreData trustScoreData) {
        super();
        this.userHash = trustScoreData.getUserHash().toHexString();
        this.trustScore = trustScoreData.getTrustScore();
        this.kycTrustScore = trustScoreData.getKycTrustScore();

    }
}
