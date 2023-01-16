package object.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
