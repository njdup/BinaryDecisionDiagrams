package BDD.parser.expressions;

import java.util.Map;

public final class AndExpression extends ExpressionTree {
  private ExpressionTree left;
  private ExpressionTree right;

  public AndExpression(ExpressionTree left, ExpressionTree right) {
    this.left = left;
    this.right = right;
  }

  public boolean evaluate(Map<String, Boolean> assignments) {
    return left.evaluate(assignments) && right.evaluate(assignments);
  }
}
