/**
 * Write a description of class HangmanGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangmanGame
{
    private String secretWord;
    private String gameStatus = "";
    private String guessedLetters = " ";
    public HangmanGame(String secretWord)
    {
       this.secretWord = secretWord;
       this.gameStatus = gameStatus;
       this.guessedLetters = guessedLetters;
        
       for(int n = 0; n <= secretWord.length() - 1; n++)
        {
            if (Character.isLetter(secretWord.charAt(n)))
            {
                gameStatus += "-";
            }
            else
            {
                gameStatus += secretWord.charAt(n);
            }
        }
    }
    public String getTried()
    {
        return guessedLetters;
    }
    public String getGuessed()
    {
        return gameStatus;
    }
    public int tryLetter(char a)
    {
      if (guessedLetters.indexOf(a) >= 0) 
        {
            return 0;
        }
      guessedLetters += " " + a;
       if (secretWord.indexOf(a) == -1)
      {
          return -1;
        }
      else
      {
            for (int i = 0; i < secretWord.length(); i++)
            {
                if (secretWord.charAt(i) == a)
                {
                    gameStatus = gameStatus.substring(0,i) + a + gameStatus.substring(i + 1);
                }
            }
            return 1;
      }

        /*for(int n = 0; n < secretWord .length(); n++)
        {
           if (secretWord.charAt(n) == a)
           {
             gameStatus = (gameStatus.substring(0,n) + a + gameStatus.substring(n+1));
           }
         }
        if (guessedLetters.indexOf(a) >= 0)
        {
            return 0;
        }
        guessedLetters += a + " ";
        if (secretWord.indexOf(a) >= 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }*/
    }
}
