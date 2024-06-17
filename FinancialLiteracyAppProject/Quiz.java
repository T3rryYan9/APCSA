// This Java program defines a Quiz class that creates a simple quiz application using Swing.
// It includes questions, options, and correct answers, with a timer for each question.

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener { 
  // Array to store quiz questions
  String[] questions = { 
    // Retirement
    "What age do most people consider retiring?", //1
    "How does starting retirement savings early impact your financial future?", //2
    "What is a common retirement savings vehicle?", //3
    "Which factor is crucial when planning for retirement?", //4

    // Career Choices
    "What is a significant consideration when choosing a career?", //5
    "How can furthering your education impact your career prospects?", //6
    "What is a common mistake when negotiating a job offer?", //7
    "How does networking contribute to career success?", //8

    // Debt
    "What is the recommended approach to managing credit card debt?", //9
    "How does a high credit score affect borrowing costs?", //10
    "What is the difference between secured and unsecured debt?", //11
    "Why is it important to have an emergency fund when dealing with debt?", //12

    // Pathways and Resources to Financial Literacy
    "Where can individuals find reliable information on financial literacy?", //13
    "What is a common resource for learning about budgeting?", //14
    "How can financial literacy programs benefit communities?", //15
    "What role do government initiatives play in promoting financial literacy?", //16

    // Retirement
    "What is a common retirement planning mistake to avoid?", //17
    "How does inflation impact retirement savings?",//18
    "What is the 4% rule in retirement planning?", //19
    "Why is diversification important in retirement investments?", //20

    // Career Choices
    "How does job satisfaction impact overall financial well-being?", //21
    "What is the significance of a career development plan?", //22
    "How can mentorship contribute to career growth?", //23
    "What is the importance of adapting to changing job markets?", //24

    // Debt
    "What is the snowball method in debt repayment?", //25
    "How does interest accrual affect the total cost of a loan?",//26
    "Why is it important to read the terms and conditions of a loan?",//27
    "How does prioritizing high-interest debt impact financial health?", //28

    // Pathways and Resources to Financial Literacy
    "Why is ongoing financial education important?", //29
    "How can community workshops contribute to financial literacy?", //30
    "What role do financial counselors play in assisting individuals?", //31
    "How can technology be utilized for financial education?", //32

    // Retirement
    "What is the impact of delaying retirement savings?", //33
    "How does Social Security contribute to retirement income?", //34
    "What is a Roth IRA, and how does it differ from a traditional IRA?", //35
    "How does healthcare cost factor into retirement planning?", //36

    // Career Choices
    "Why is it important to align your career goals with your values?", //37
    "What are transferable skills, and how do they benefit a career switch?", //38
    "How can professional certifications enhance career opportunities?", //39
    "What is the significance of staying informed about industry trends in career planning?" //40
  };

  // 2D array to store options for each question
  // Question numbers are labelled
  String[][] options = {
    // Retirement
    {"60", "65", "70", "75"}, //1
    {"It doesn't matter", "It has no impact", "It provides more time for growth", "It is unnecessary"}, //2
    {"Savings account", "Real estate", "401(k)", "Checking account"}, //3
    {"Current lifestyle", "Monthly expenses", "Social security benefits", "Inheritance expectations"}, //4

    // Career Choices
    {"High salary", "Job satisfaction", "Short working hours", "Job location"}, //5
    {"It doesn't make a difference", "It may limit your options", "It has no impact", "It's unnecessary"}, //6
    {"Accepting the first offer", "Negotiating for a higher salary", "Considering company culture", "Researching the industry"}, //7
    {"It is not relevant", "It helps build relationships", "It only matters in certain industries", "It's a waste of time"}, //8

    // Debt
    {"Pay the minimum each month", "Ignore it until it goes away", "Pay more than the minimum", "Avoid using credit cards"}, //9
    {"It has no impact", "It increases borrowing costs", "It only affects large loans", "It lowers interest rates"}, //10
    {"Secured debt is riskier", "Unsecured debt requires collateral", "Secured debt has higher interest rates", "Unsecured debt is riskier"}, //11
    {"It is unnecessary", "It helps build credit", "It provides a safety net", "It only applies to certain individuals"}, //12

    // Pathways and Resources to Financial Literacy
    {"Social media", "Libraries", "Financial advisors", "Friends and family"}, //13
    {"Cooking websites", "Fashion magazines", "Financial blogs", "Social media influencers"}, //14
    {"They are irrelevant", "They can empower individuals", "They only benefit high-income households", "They are time-consuming"}, //15
    {"They have no role", "They may provide grants", "They create financial barriers", "They promote financial inequality"}, //16

    // Retirement
    {"Relying solely on Social Security", "Starting retirement savings early", "Ignoring inflation", "Investing in diverse assets"}, //17
    {"It has no impact", "It decreases the purchasing power of savings", "It only affects high-income individuals", "It accelerates savings growth"}, //18
    {"It determines the maximum age for retirement", "It suggests withdrawing 4% of savings annually", "It sets the minimum retirement age", "It advises against retirement planning"},//19
    {"It is unnecessary", "It increases risk", "It ensures stable returns", "It limits investment options"}, //20

    // Career Choices
    {"It has no impact", "It affects mental health only", "It has a direct impact on financial well-being", "It only matters in the early stages of a career"}, //21
    {"It is irrelevant", "It restricts career choices", "It helps in setting long-term goals", "It is a one-time exercise"}, //22
    {"It is unimportant", "It has no impact on career growth", "It provides guidance and support", "It limits professional connections"}, //23
    {"It is unnecessary", "It only applies to specific industries", "It is irrelevant", "It ensures adaptability and resilience"}, //24

    // Debt
    {"A method of reducing debt gradually", "A strategy for avoiding debt", "A method of increasing debt", "A term for financial planning"}, //25
    {"It doesn't matter", "It increases the total cost", "It has no impact", "It only affects interest rates"}, //26
    {"It is unnecessary", "It may contain important information", "It slows down the borrowing process", "It only applies to large loans"}, //27
    {"It prolongs debt repayment", "It has no impact on financial health", "It reduces overall debt", "It is unnecessary"}, //28

    // Pathways and Resources to Financial Literacy
    {"It's a one-time learning process", "It is irrelevant", "It only applies to certain demographics", "It enhances financial decision-making"}, //29
    {"They are ineffective", "They are time-consuming", "They contribute to financial literacy", "They only benefit low-income individuals"}, //30
    {"They have no role in financial planning", "They provide personalized financial advice", "They create financial dependencies", "They are outdated"}, //31
    {"It hinders financial education", "It is irrelevant", "It limits accessibility", "It can enhance financial literacy"}, //32

    //Retirement
    {"It accelerates retirement savings", "It has no impact", "It decreases the retirement age", "It increases the risk of financial instability"}, //33
    {"It provides the majority of retirement income", "It is irrelevant to retirement planning", "It only benefits high-income individuals", "It is a government grant"}, //34
    {"A Roth IRA is for early retirement only", "A Roth IRA has no tax benefits", "A traditional IRA is for high-income individuals", "A Roth IRA is funded with after-tax dollars"}, //35
    {"It is not a consideration in retirement planning", "It is covered by Social Security", "It is a significant expense", "It only impacts high-income retirees"}, //36

    // Career Coices
    {"It has no impact", "It is a personal choice", "It only matters in specific industries", "It can lead to a fulfilling career"}, //37
    {"They are irrelevant", "They have no value", "They are specific to certain professions", "They are universally applicable"}, //38
    {"They are unnecessary", "They only benefit entry-level positions", "They can open new career paths", "They have no impact on career growth"}, //39
    {"It is irrelevant", "It is unnecessary", "It is specific to certain industries", "It ensures adaptability and competitiveness"} //40
  };

  // Array to store correct answers for each question
  char[] answers = {
    'B', 'C', 'C', 'A', // 4
    'B', 'C', 'A', 'B', // 8
    'C', 'D', 'B', 'C', // 12
    'D', 'C', 'B', 'B', // 16
    'A', 'B', 'B', 'D', // 20
    'B', 'D', 'C', 'D', // 24
    'C', 'B', 'A', 'C', // 28
    'A', 'B', 'C', 'D', // 32
    'B', 'B', 'A', 'C', // 36
    'D', 'A', 'B', 'C'  // 40 (need 10 more)
  };

  char guess; // Variable to store user's guess
  char answer; // Variable to store correct answer for the current question
  int index; // Index to keep track of the current question
  int correct_guesses = 0; // Counter for correct answers
  int total_questions = questions.length; // Total number of questions
  int result; // Percentage score
  int seconds = 15; // 15 second timer

  //GUI components
  JFrame frame = new JFrame();
  JTextField textfield = new JTextField();
  JTextArea textarea = new JTextArea();
  JButton buttonA = new JButton();
  JButton buttonB = new JButton();
  JButton buttonC = new JButton();
  JButton buttonD = new JButton();
  JLabel answer_labelA = new JLabel();
  JLabel answer_labelB = new JLabel();
  JLabel answer_labelC = new JLabel();
  JLabel answer_labelD = new JLabel();
  JLabel time_label = new JLabel();
  JLabel seconds_left = new JLabel();
  JTextField number_right = new JTextField();
  JTextField percentage = new JTextField();

  // Timer for the quiz
  Timer timer = new Timer(1000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      seconds--;
      seconds_left.setText(String.valueOf(seconds));

      // When the timer reaches 0, display the correct answer
      if(seconds<=0) {
        displayAnswer();
      }
    }
  });

  // Constructor for the Quiz class
  public Quiz() {
    // Setting up the GUI frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(650,650);
    frame.getContentPane().setBackground(new Color(50,50,50));
    frame.setLayout(null);
    frame.setResizable(false);

    // Setting up various GUI components (text fields, buttons, labels, etc.)
    // Question title
    textfield.setBounds(0,0,650,50);
    textfield.setBackground(new Color(25,25,25));
    textfield.setForeground(new Color(100,255,110));
    textfield.setFont(new Font("Lexend",Font.BOLD,30));
    textfield.setBorder(BorderFactory.createBevelBorder(1));
    textfield.setHorizontalAlignment(JTextField.CENTER);
    textfield.setEditable(false);

    // Actual question
    textarea.setBounds(0,50,650,75);
    textarea.setLineWrap(true);
    textarea.setWrapStyleWord(true);
    textarea.setBackground(new Color(25,25,25));
    textarea.setForeground(new Color(100,255,110));
    textarea.setFont(new Font("Lexend",Font.BOLD,25));
    textarea.setBorder(BorderFactory.createBevelBorder(1));
    textarea.setEditable(false);

    buttonA.setBounds(0,125,100,100);
    buttonA.setFont(new Font("Lexend",Font.BOLD,35));
    buttonA.setFocusable(false);
    buttonA.addActionListener(this);
    buttonA.setText("A");

    buttonB.setBounds(0,225,100,100);
    buttonB.setFont(new Font("Lexend",Font.BOLD,35));
    buttonB.setFocusable(false);
    buttonB.addActionListener(this);
    buttonB.setText("B");

    buttonC.setBounds(0,325,100,100);
    buttonC.setFont(new Font("Lexend",Font.BOLD,35));
    buttonC.setFocusable(false);
    buttonC.addActionListener(this);
    buttonC.setText("C");

    buttonD.setBounds(0,425,100,100);
    buttonD.setFont(new Font("Lexend",Font.BOLD,35));
    buttonD.setFocusable(false);
    buttonD.addActionListener(this);
    buttonD.setText("D");

    answer_labelA.setBounds(125,125,500,100);
    answer_labelA.setBackground(new Color(50,50,50));
    answer_labelA.setForeground(new Color(100,255,110));
    answer_labelA.setFont(new Font("Lexend",Font.PLAIN,14));

    answer_labelB.setBounds(125,225,500,100);
    answer_labelB.setBackground(new Color(50,50,50));
    answer_labelB.setForeground(new Color(100,255,110));
    answer_labelB.setFont(new Font("Lexend",Font.PLAIN,14));

    answer_labelC.setBounds(125,325,500,100);
    answer_labelC.setBackground(new Color(50,50,50));
    answer_labelC.setForeground(new Color(100,255,110));
    answer_labelC.setFont(new Font("Lexend",Font.PLAIN,14));

    answer_labelD.setBounds(125,425,500,100);
    answer_labelD.setBackground(new Color(50,50,50));
    answer_labelD.setForeground(new Color(100,255,110));
    answer_labelD.setFont(new Font("Lexend",Font.PLAIN,14));

    seconds_left.setBounds(535,510,100,100);
    seconds_left.setBackground(new Color(25,25,25));
    seconds_left.setForeground(new Color(100,255,110));
    seconds_left.setFont(new Font("Lexend",Font.BOLD,60));
    seconds_left.setBorder(BorderFactory.createBevelBorder(1));
    seconds_left.setOpaque(true);
    seconds_left.setHorizontalAlignment(JTextField.CENTER);
    seconds_left.setText(String.valueOf(seconds));

    time_label.setBounds(535,475,100,25);
    time_label.setBackground(new Color(50,50,50));
    time_label.setForeground(new Color(255,80,80));
    time_label.setFont(new Font("Lexend",Font.PLAIN,16));
    time_label.setHorizontalAlignment(JTextField.CENTER);
    time_label.setText("Timer:");

    number_right.setBounds(225,225,200,100);
    number_right.setBackground(new Color(25,25,25));
    number_right.setForeground(new Color(100,255,110));
    number_right.setFont(new Font("Lexend",Font.BOLD,50));
    number_right.setBorder(BorderFactory.createBevelBorder(1));
    number_right.setHorizontalAlignment(JTextField.CENTER);
    number_right.setEditable(false);

    percentage.setBounds(225,325,200,100);
    percentage.setBackground(new Color(25,25,25));
    percentage.setForeground(new Color(100,255,110));
    percentage.setFont(new Font("Lexend",Font.BOLD,50));
    percentage.setBorder(BorderFactory.createBevelBorder(1));
    percentage.setHorizontalAlignment(JTextField.CENTER);
    percentage.setEditable(false);

    // Adding GUI components to the frame
    frame.add(time_label);
    frame.add(seconds_left);
    frame.add(answer_labelA);
    frame.add(answer_labelB);
    frame.add(answer_labelC);
    frame.add(answer_labelD);
    frame.add(buttonA);
    frame.add(buttonB);
    frame.add(buttonC);
    frame.add(buttonD);
    frame.add(textarea);
    frame.add(textfield);
    frame.setVisible(true);

    // Start the quiz by displaying the first question
    nextQuestion();
  }

  // Getters and setters for various variables and components
  public String[] getQuestions() {
	 return questions;
  }

  public void setQuestions(String[] questions) {
  	this.questions = questions;
  }
  
  public String[][] getOptions() {
  	return options;
  }
  
  public void setOptions(String[][] options) {
  	this.options = options;
  }
  
  public char[] getAnswers() {
  	return answers;
  }
  
  public void setAnswers(char[] answers) {
  	this.answers = answers;
  }
  
  public char getGuess() {
  	return guess;
  }
  
  public void setGuess(char guess) {
  	this.guess = guess;
  }
  
  public char getAnswer() {
  	return answer;
  }
  
  public void setAnswer(char answer) {
  	this.answer = answer;
  }
  
  public int getIndex() {
  	return index;
  }
  
  public void setIndex(int index) {
  	this.index = index;
  }
  
  public int getCorrect_guesses() {
  	return correct_guesses;
  }
  
  public void setCorrect_guesses(int correct_guesses) {
  	this.correct_guesses = correct_guesses;
  }
  
  public int getTotal_questions() {
  	return total_questions;
  }
  
  public void setTotal_questions(int total_questions) {
  	this.total_questions = total_questions;
  }
  
  public int getResult() {
  	return result;
  }
  
  public void setResult(int result) {
  	this.result = result;
  }
  
  public int getSeconds() {
  	return seconds;
  }
  
  public void setSeconds(int seconds) {
  	this.seconds = seconds;
  }
  
  public JFrame getFrame() {
  	return frame;
  }
  
  public void setFrame(JFrame frame) {
  	this.frame = frame;
  }
  
  public JTextField getTextfield() {
  	return textfield;
  }
  
  public void setTextfield(JTextField textfield) {
  	this.textfield = textfield;
  }
  
  public JTextArea getTextarea() {
  	return textarea;
  }
  
  public void setTextarea(JTextArea textarea) {
  	this.textarea = textarea;
  }
  
  public JButton getButtonA() {
  	return buttonA;
  }
  
  public void setButtonA(JButton buttonA) {
  	this.buttonA = buttonA;
  }
  
  public JButton getButtonB() {
  	return buttonB;
  }
  
  public void setButtonB(JButton buttonB) {
  	this.buttonB = buttonB;
  }
  
  public JButton getButtonC() {
  	return buttonC;
  }
  
  public void setButtonC(JButton buttonC) {
  	this.buttonC = buttonC;
  }
  
  public JButton getButtonD() {
  	return buttonD;
  }
  
  public void setButtonD(JButton buttonD) {
  	this.buttonD = buttonD;
  }
  
  public JLabel getAnswer_labelA() {
  	return answer_labelA;
  }
  
  public void setAnswer_labelA(JLabel answer_labelA) {
  	this.answer_labelA = answer_labelA;
  }
  
  public JLabel getAnswer_labelB() {
  	return answer_labelB;
  }
  
  public void setAnswer_labelB(JLabel answer_labelB) {
  	this.answer_labelB = answer_labelB;
  }
  
  public JLabel getAnswer_labelC() {
  	return answer_labelC;
  }
  
  public void setAnswer_labelC(JLabel answer_labelC) {
  	this.answer_labelC = answer_labelC;
  }
  
  public JLabel getAnswer_labelD() {
  	return answer_labelD;
  }
  
  public void setAnswer_labelD(JLabel answer_labelD) {
  	this.answer_labelD = answer_labelD;
  }
  
  public JLabel getTime_label() {
  	return time_label;
  }
  
  public void setTime_label(JLabel time_label) {
  	this.time_label = time_label;
  }
  
  public JLabel getSeconds_left() {
  	return seconds_left;
  }
  
  public void setSeconds_left(JLabel seconds_left) {
  	this.seconds_left = seconds_left;
  }
  
  public JTextField getNumber_right() {
  	return number_right;
  }
  
  public void setNumber_right(JTextField number_right) {
  	this.number_right = number_right;
  }
  
  public JTextField getPercentage() {
  	return percentage;
  }
  
  public void setPercentage(JTextField percentage) {
  	this.percentage = percentage;
  }
  
  public Timer getTimer() {
  	return timer;
  }
  
  public void setTimer(Timer timer) {
  	this.timer = timer;
  }

  // If index (what question the user is on) = total questions, print results. Otherwise, print "question" + question number, and set up the interface based on our first set of arrays. Start the timer each question.
  public void nextQuestion() {
    if(index >= total_questions) {
      results();
    } else {
      textfield.setText("Question "+(index+1));
      textarea.setText(questions[index]);
      
      answer_labelA.setText(options[index][0]);
      answer_labelB.setText(options[index][1]);
      answer_labelC.setText(options[index][2]);
      answer_labelD.setText(options[index][3]);
      
      timer.start();
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Disable all buttons at the start of the program
    buttonA.setEnabled(false);
    buttonB.setEnabled(false);
    buttonC.setEnabled(false);
    buttonD.setEnabled(false);

    // If "A" is selected and matches the corerct answer, adds one to the correct number of guesses; Same for the rest of the method. Then displays answers
    if(e.getSource() == buttonA) {
      answer= 'A';
      
      if(answer == answers[index]) {
        correct_guesses++;
      }
    }

    if(e.getSource() == buttonB) {
      answer= 'B';
      
      if(answer == answers[index]) {
        correct_guesses++;
      }
    }

    if(e.getSource() == buttonC) {
      answer= 'C';

      if(answer == answers[index]) {
        correct_guesses++;
      }
    }
    
    if(e.getSource()==buttonD) {
      answer= 'D';
      
      if(answer == answers[index]) {
        correct_guesses++;
      }
    }

    displayAnswer();
  }

  // What happens when answers are displayed. Timer stops, buttons are disabled, and the wrong answers turn red.
  public void displayAnswer() {
    timer.stop();

    buttonA.setEnabled(false);
    buttonB.setEnabled(false);
    buttonC.setEnabled(false);
    buttonD.setEnabled(false);

    if(answers[index] != 'A')
      answer_labelA.setForeground(new Color(255,80,80));

    if(answers[index] != 'B')
      answer_labelB.setForeground(new Color(255,80,80));

    if(answers[index] != 'C')
      answer_labelC.setForeground(new Color(255,80,80));

    if(answers[index] != 'D')
      answer_labelD.setForeground(new Color(255,80,80));

    // Sets a new timer object that ticks after two seconds.
    Timer pause = new Timer(2000, new ActionListener() {
      // The color of the answer labels are set to green. The answers and seconds are reset, and then seconds_left is updated to display the value of the "seconds" variable. The buttons are enabled. Index is increased. The code moves to the next question.
      @Override
      public void actionPerformed(ActionEvent e) {
        answer_labelA.setForeground(new Color(100,255,110));
        answer_labelB.setForeground(new Color(100,255,110));
        answer_labelC.setForeground(new Color(100,255,110));
        answer_labelD.setForeground(new Color(100,255,110));

        answer = ' ';
        seconds = 10;
        seconds_left.setText(String.valueOf(seconds));

        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);

        index++;

        nextQuestion();
      }
    });

    // The pause object is told not to repeat and is started.
    pause.setRepeats(false);
    pause.start();
  }

  // When results are called
  public void results() {
    // Buttons disabled
    buttonA.setEnabled(false);
    buttonB.setEnabled(false);
    buttonC.setEnabled(false);
    buttonD.setEnabled(false);

    // Calculate percentage
    result = (int)((correct_guesses/(double)total_questions)*100);

    // Sets text = shows results but empties the rest of the lines
    textfield.setText("Your quiz results:");
    textarea.setText("");
    
    answer_labelA.setText("");
    answer_labelB.setText("");
    answer_labelC.setText("");
    answer_labelD.setText("");

    // Displays percentage
    number_right.setText("("+correct_guesses+"/"+total_questions+")");
    percentage.setText(result+"%");

    frame.add(number_right);
    frame.add(percentage);
  }
}
