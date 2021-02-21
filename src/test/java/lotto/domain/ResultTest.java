package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {
    @DisplayName("매치 카운트랑 보너스 카운트에 맞는 합당한 결과를 알려 주는지")
    @Test
    void getResult() {
        int matchCount = 0;
        boolean bonusMatch = true;

        assertThat(Result.decisionLottoRank(matchCount, bonusMatch)).isEqualTo(Result.NONE);
    }

//    @DisplayName("총 수익을 계산")
//    @Test
//    void calculateTotalProfit() {
//        Lotto lotto1 = new Lotto(Arrays.asList(1, 2, 3, 20, 21, 40)); // FIFTH
//        Lotto lotto2 = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 20)); // SECOND
//        Lotto lotto3 = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 20)); // SECOND
//        Lottos lottos = new Lottos(Arrays.asList(lotto1, lotto2, lotto3));
//
//        List<Result> results = lottos.checkLottoResults(new WinningLotto("1, 2, 3, 4, 5, 6"), new BonusNumber("20"));
//
//        float profit = Result.calculateProfit(results);
//        assertThat(profit).isEqualTo(60_005_000);
//    }
}
