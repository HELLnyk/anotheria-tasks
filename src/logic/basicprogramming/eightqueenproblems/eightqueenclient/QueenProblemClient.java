package logic.basicprogramming.eightqueenproblems.eightqueenclient;

import logic.basicprogramming.eightqueenproblems.eightqueensolution.QueenProblem;

/**
 * Test QueenProblem
 *
 * @author hellnyk
 */
public class QueenProblemClient {

    public static void main(String[] args) {
        new QueenProblem(8, 0).searchResult();
    }
}
