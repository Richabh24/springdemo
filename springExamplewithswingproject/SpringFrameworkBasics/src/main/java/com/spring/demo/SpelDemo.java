package com.spring.demo;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.expression.Expression;


/**
 * Created by ttnd on 25/6/16.
 */
public class SpelDemo {
    public static void main(String[] args) {
        Person person = new Person("xyz person ", 24, "delhi");
        StandardEvaluationContext standardEvaluationContext = new StandardEvaluationContext(person);
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("name");
        System.out.println(expression.getValue(standardEvaluationContext));



        StandardEvaluationContext context = new StandardEvaluationContext();
        ExpressionParser expressionParser1=new SpelExpressionParser();
        Expression   expression1 = expressionParser1.parseExpression("(#a * #b)+#c");
        context.setVariable("a", 2);
        context.setVariable("b", 4);
        context.setVariable("c", 1);
        System.out.println(expression1.getValue(context));



    }
}