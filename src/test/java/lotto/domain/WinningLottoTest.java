package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinningLottoTest {

    @DisplayName("당첨번호 생성 확인")
    @Test
    void correctWinningNumber() {
        List<Integer> winningNumber = Arrays.asList(1, 2, 3, 4, 5, 6);

        BonusNumber bonusNumber = new BonusNumber(7);
        WinningLotto winningLotto = new WinningLotto(new Lotto(winningNumber), bonusNumber);


        assertThat(winningLotto).isEqualTo(new WinningLotto(new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6)), new BonusNumber(7)));
    }

    @DisplayName("로또 당첨결과 확인")
    @Test
    void testEntireLottoMatching() {
        Lotto lotto1 = new Lotto(Arrays.asList(1, 2, 3, 20, 21, 40));
        Lotto lotto2 = new Lotto(Arrays.asList(1, 2, 20, 25, 29, 45));
        Lottos lottos = new Lottos(Arrays.asList(lotto1, lotto2));

        WinningLotto winningLotto = new WinningLotto(new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6)), new BonusNumber(20));
        List<Result> results = winningLotto.getWinningResult(lottos.getLottos());

        List<Result> expectedResults = Arrays.asList(Result.FIFTH, Result.NONE);

        assertThat(results).isEqualTo(expectedResults);
    }
}
