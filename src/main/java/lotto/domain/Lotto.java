package lotto.domain;

import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> lottoNumbers;

    public Lotto(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public int countMatchingNumbers(List<Integer> numbers) {
        return (int) numbers.stream()
                .filter(lottoNumbers::contains)
                .count();
    }

    public boolean isBonusMatch(int bonusNumber) {
        return lottoNumbers.contains(bonusNumber);
    }

    public String getNumbers() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(Ints.join(", ",lottoNumbers.stream().mapToInt(i->i).toArray()));
        sb.append("]");

        return sb.toString();
    }
}
