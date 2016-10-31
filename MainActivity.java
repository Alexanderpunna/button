package com.example.alexander.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* Används ej
//import java.util.Random;
//import java.util.Arrays;
//import java.util.jar.Attributes;
//import android.view.Menu;
*/

public class MainActivity extends Activity {



    String[] quotes = {
            // 24-10-2016 (89 quotes)

            // Abraham Lincoln 15
            "You cannot escape the responsibility of tomorrow by evading it today. \n\n\n - Abraham Lincoln",
            "No man has a good enough memory to be a successful liar. \n\n\n - Abraham Lincoln",
            "Most folks are as happy as they make up their minds to be \n\n\n - Abraham Lincoln",
            "Be sure you put your feet in the right place, then stand firm. \n\n\n - Abraham Lincoln",
            "Whatever you are, be a good one. \n\n\n - Abraham Lincoln",
            "In the end, it's not the years in your life that count. It's the life in your years. \n\n\n - Abraham Lincoln",
            "I will prepare and some day my chance will come. \n\n\n - Abraham Lincoln",
            "A house divided against itself cannot stand. \n\n\n - Abraham Lincoln",
            "Everybody likes a compliment. \n\n\n - Abraham Lincoln",
            "Do I not destroy my enemies when I make them my friends? \n\n\n - Abraham Lincoln",
            "Marriage is neither heaven nor hell, it is simply purgatory. \n\n\n - Abraham Lincoln",
            "What kills a skunk is the publicity it gives itself. \n\n\n - Abraham Lincoln",
            "A friend is one who has the same enemies as you have. \n\n\n - Abraham Lincoln",
            "The best way to predict the future is to create it. \n\n\n - Abraham Lincoln",
            "I walk slowly, but I never walk backward. \n\n\n - Abraham Lincoln",

            // Albert Einstein 13
            "You can't blame gravity for falling in love. \n\n\n - Albert Einstein",
            "Try not to become a man of success, but rather try to become a man of value. \n\n\n - Albert Einstein",
            "The only source of knowledge is experience. \n\n\n - Albert Einstein",
            "Everyone should be respected as an individual, but no one idolized. \n\n\n - Albert Einstein",
            "A person who never made a mistake never tried anything new. \n\n\n - Albert Einstein",
            "I have no special talent. I am only passionately curious \n\n\n - Albert Einstein",
            "Strive not to be a success, but rather to be of value \n\n\n - Albert Einstein",
            "Intellectuals solve problems, geniuses prevent them \n\n\n - Albert Einstein",
            "The only reason for time is so that everything doesn't happen at once \n\n\n - Albert Einstein",
            "If the facts don't find the theory, change the facts \n\n\n - Albert Einstein",
            "Only a life lived for others is a life worthwhile \n\n\n - Albert Einstein",
            "Everything should be made as simple as possible, but not simpler \n\n\n - Albert Einstein",
            "We cannot solve our problems with the same thinking we used when we created them \n\n\n - Albert Einstein",


            // Adam Devine 2
            "Jealousy is the worst trait in any person. \n\n\n - Adam Devine",
            "People want to be friends with someone who likes to have a good time. \n\n\n - Adam Devine",

            // Adlai E. Stevenson 6
            "It's hard to lead a cavalry charge if you think you look funny on a horse \n\n\n - Adlai E. Stevenson",
            "A beauty is a woman you notice; a charmer is one who notices you. \n\n\n - Adlai E. Stevenson",
            "Nature is neutral. \n\n\n - Adlai E. Stevenson",
            "Some people approach every problem with an open mouth. \n\n\n - Adlai E. Stevenson",
            "Making peace is harder than making war. \n\n\n - Adlai E. Stevenson",
            "The human race has improved everything, but the human race. \n\n\n - Adlai E. Stevenson",


            // Alexander Pope 3
            "To be angry is to revenge the faults of others on ourselves.\n\n\n - Alexander Pope",
            "Some people will never learn anything, for this reason, because they understand everything too soon. \n\n - Alexander Pope",
            "Passions are the gales of life. \n\n\n - Alexander Pope",

            // Aristotle 5
            "Quality is not an act, it is a habit. \n\n\n - Aristotle",
            "Happiness depends upon ourselves. \n\n\n - Aristotle",
            "My best friend is the man who in wishing me well wishes it for my sake. \n\n\n - Aristotle",
            "There is no great genius without some touch of madness. \n\n\n - Aristotle",
            "Pleasure in the job puts perfection in the work. \n\n\n - Aristotle",

            // Al Pacino 2
            "it's easy to fool the eye but it's hard to fool the heart. \n\n\n - Al Pacino",
            "Money makes your life easier. If you're lucky to have it, you're lucky. \n\n\n - Al Pacino",

            // Alan Mooren 5
            "I enjoy putting my mind into different situations rather than my body. \n\n\n - Alan Mooren",
            "All culture must have arisen from cult. \n\n\n - Alan Mooren",
            "If you're functional, it doesn't matter if you're mad. \n\n\n - Alan Mooren",
            "Don't leave home without your sword - your intellect. \n\n\n - Alan Mooren",
            "I love the smell of paper in the morning; it smells like victory. \n\n\n - Alan Mooren",

            // Albert Camus 8
            "You cannot create experience. You must undergo it. \n\n\n - Albert Camus",
            "To be happy we must not be too concerned with others. \n\n\n - Albert Camus",
            "Freedom is nothing but a chance to be better. \n\n\n - Albert Camus",
            "There is no love of life without despair of life. \n\n\n - Albert Camus",
            "Friendship often ends in love, but love in friendship - never. \n\n\n - Albert Camus",
            "No cause justifies the deaths of innocent people. \n\n\n - Albert Camus" ,
            "Heroism is accessible. Happiness is more difficult. \n\n\n - Albert Camus",
            "We call first truths those we discover after all the others. \n\n\n - Albert Camus",

            // Amelia Barr 3
            "It is always the simple that produces the marvelous. \n\n\n - Amelia Barr",
            "With renunciation life begins. \n\n\n - Amelia Barr",
            "What we buy, and pay for, is part of ourselves. \n\n\n - Amelia Barr",

            // Aneurin Bevan 1
            "This is my truth, tell me yours. \n\n\n - Aneurin Bevan",

            // Anne Morrow Lindbergh 5
            "The wave of the future is coming and there is no fighting it. \n\n\n - Anne Morrow Lindbergh",
            "The most exhausting thing in life is being insincere. \n\n\n - Anne Morrow Lindbergh" ,
            "I feel we are all islands - in a common sea. \n\n\n - Anne Morrow Lindbergh",
            "Life is a gift, given in trust - like a child. \n\n\n - Anne Morrow Lindbergh" ,
            "One can never pay in gratitude; one can only pay 'in kind' somewhere else in life. \n\n\n - Anne Morrow Lindbergh",

            // Annie Dillard 5
            "How we spend our days is, of course, how we spend our lives. \n\n\n - Annie Dillard",
            "Spend the afternoon. You can't take it with you. \n\n\n - Annie Dillard",
            "The surest sign of age is loneliness. \n\n\n - Annie Dillard",
            "You can't test courage cautiously. \n\n\n - Annie Dillard",
            "I would like to learn, or remember, how to live. \n\n\n - Annie Dillard",

            //Anthony Burgess 4
            "I didn't think; I experimented. \n\n\n - Anthony Burgess",
            "We all need money, but there are degrees of desperation. \n\n\n - Anthony Burgess",
            "The possession of a book becomes a substitute for reading it. \n\n\n - Anthony Burgess",
            "Readers are plentiful: thinkers are rare. \n\n\n - Anthony Burgess",

            // Arnold H. Glasow 7
            "Success is simple. Do what's right, the right way, at the right time. \n\n\n - Arnold H. Glasow",
            "The fewer the facts, the stronger the opinion. \n\n\n - Arnold H. Glasow",
            "Live so that your friends can defend you but never have to. \n\n\n - Arnold H. Glasow",
            "Laughter is a tranquilizer with no side effects. \n\n\n - Arnold H. Glasow",
            "Nothing lasts forever - not even your troubles. \n\n\n - Arnold H. Glasow",
            "Improvement begins with I. \n\n\n - Arnold H. Glasow",
            "All some folks want is their fair share and yours. \n\n\n - Arnold H. Glasow",

            // Benjamin Franklin 5
            "Tell me and I forget. Teach me and I remember. Involve me and I learn. \n\n\n - Benjamin Franklin",
            "Wine is constant proof that God loves us and loves to see us happy. \n\n\n - Benjamin Franklin",
            "Well done is better than well said. \n\n\n - Benjamin Franklin",
            "Life's tragedy is that we get old too soon and wise too late. \n\n\n - Benjamin Franklin",
            "Be slow in choosing a friend, slower in changing. \n\n\n - Benjamin Franklin",

            // 25-10-2016 (21 quotes)

            // Arthur Schopenhauer 13
            "Just remember, once you're over the hill you begin to pick up speed. \n\n\n - Arthur Schopenhauer",
            "Talent hits a target no one else can hit; Genius hits a target no one else can see. \n\n\n - Arthur Schopenhauer",
            "The two enemies of human happiness are pain and boredom. \n\n\n - Arthur Schopenhauer",
            "In action a great heart is the chief qualification. In work, a great head. \n\n\n - Arthur Schopenhauer",
            "Martyrdom is the only way a man can become famous without ability. \n\n\n - Arthur Schopenhauer",
            "It is a clear gain to sacrifice pleasure in order to avoid pain. \n\n\n - Arthur Schopenhauer",
            "Politeness is to human nature what warmth is to wax. \n\n\n - Arthur Schopenhauer",
            "To buy books would be a good thing if we also could buy the time to read them. \n\n\n - Arthur Schopenhauer",
            "To free a person from error is to give, and not to take away.\n\n\n - Arthur Schopenhauer",
            "We forfeit three-quarters of ourselves in order to be like other people. \n\n\n - Arthur Schopenhauer",
            "It is only at the first encounter that a face makes its full impression on us. \n\n\n - Arthur Schopenhauer",
            "Honor has not to be won; it must only not be lost. \n\n\n - Arthur Schopenhauer",
            "Journalists are like dogs, when ever anything moves they begin to bark. \n\n\n - Arthur Schopenhauer",

            // Abdolkarim Soroush 1
            "When I have an idea, I'm like a pregnant woman. I just have to deliver. \n\n\n - Abdolkarim Soroush",

            // Adam Braun 1
            "The single most powerful element of youth is our inability to know what's impossible. \n\n\n - Adam Braun",

            // Adrienne Rich 2
            "Lying is done with words and also with silence. \n\n\n - Adrienne Rich",
            "Pride is a tricky, glorious, double-edged feeling. \n\n\n - Adrienne Rich",

            // Alfred A. Montapert 4
            "Expect problems and eat them for breakfast. \n\n\n - Alfred A. Montapert",
            "Every time you get angry, you poison your own system. \n\n\n - Alfred A. Montapert",
            "All lasting business is built on friendship. \n\n\n - Alfred A. Montapert",
            "Live constructively and live optimistically. \n\n\n - Alfred A. Montapert",

            // 26-10-2016

            // Bob Marley
            "One good thing about music, when it hits you, you feel no pain. \n\n\n - Bob Marley",
            "Truth is everybody is going to hurt you: you just gotta find the ones worth suffering for. \n\n\n - Bob Marley",
            "The good times of today, are the sad thoughts of tomorrow. \n\n\n - Bob Marley",
            "In this bright future you can't forget your past. \n\n\n - Bob Marley",
            "None but ourselves can free our minds. \n\n\n - Bob Marley",
            "When one door is closed, don't you know, another is open. \n\n\n - Bob Marley",

            // Barack Obama
            "Money is not the only answer, but it makes a difference. \n\n\n - Barack Obama",
            "I just miss - I miss being anonymous. \n\n\n - Barack Obama",

            // Ben Carson
            "There is no job more important than parenting. This I believe. \n\n\n - Ben Carson",
            "So after a while, if people won't accept your excuses, you stop looking for them. \n\n\n - Ben Carson",
            "There is no one that we can afford to throw away. \n\n\n - Ben Carson",
            "You can understand why I'm a believer. I have seen miracles. \n\n\n - Ben Carson",

            // Benjamin Disraeli
            "I am prepared for the worst, but hope for the best. \n\n\n - Benjamin Disraeli",
            "Never complain and never explain. \n\n\n - Benjamin Disraeli",
            "Courage is fire, and bullying is smoke. \n\n\n - Benjamin Disraeli",
            "How much easier it is to be critical than to be correct. \n\n\n - Benjamin Disraeli",
            "Silence is the mother of truth.\n\n\n - Benjamin Disraeli",
            "Never take anything for granted. \n\n\n - Benjamin Disraeli",
            "Little things affect little minds.\n\n\n - Benjamin Disraeli",
            "There is moderation even in excess. \n\n\n - Benjamin Disraeli",
            "Things must be done by parties, not by persons using parties as tools. \n\n\n - Benjamin Disraeli",

            // Bertrand Russell
            "The good life is one inspired by love and guided by knowledge. \n\n\n - Bertrand Russell",
            "The time you enjoy wasting is not wasted time. \n\n\n - Bertrand Russell",
            "To fear love is to fear life, and those who fear life are already three parts dead. \n\n\n - Bertrand Russell",
            "Drunkenness is temporary suicide. \n\n\n - Bertrand Russell",
            "To conquer fear is the beginning of wisdom. \n\n\n - Bertrand Russell",
            "The secret to happiness is to face the fact that the world is horrible. \n\n\n- Bertrand Russell",
            "There is much pleasure to be gained from useless knowledge. \n\n\n - Bertrand Russell",
            "Science is what you know, philosophy is what you don't know. \n\n\n - Bertrand Russell",
            "All movements go too far. \n\n\n - Bertrand Russell",

            // 28-10-2016 67 (quotes)

            // Buddah
            "What we think, we become. \n\n\n - Buddah",
            "Three things cannot be long hidden: the sun, the moon, and the truth. \n\n\n - Buddah",
            "You will not be punished for your anger, you will be punished by your anger. \n\n\n - Buddah",
            "Work out your own salvation. Do not depend on others. \n\n\n - Buddah",
            "Better than a thousand hollow words, is one word that brings peace. \n\n\n - Buddah",
            "You, yourself, as much as anybody in the entire universe, deserve your love and affection. \n\n\n - Buddah",
            "Those who are free of resentful thoughts surely find peace. \n\n\n - Buddah",
            "The foot feels the foot when it feels the ground. \n\n\n - Buddah",

            // Blaise Pascal
            "Love has reasons which reason cannot understand. \n\n\n - Blaise Pascal",
            "Imagination decides everything. \n\n\n - Blaise Pascal",
            "You always admire what you really don't understand. \n\n\n - Blaise Pascal",
            "Kind words do not cost much. Yet they accomplish much. \n\n\n - Blaise Pascal",
            "The heart has its reasons of which reason knows nothing. \n\n\n - Blaise Pascal",
            "All of our reasoning ends in surrender to feeling. \n\n\n - Blaise Pascal",
            "Vanity is but the surface. \n\n\n - Blaise Pascal",
            "Evil is easy, and has infinite forms. \n\n\n - Blaise Pascal",
            "Little things console us because little things afflict us. \n\n\n - Blaise Pascal",
            "The only shame is to have none. \n\n\n - Blaise Pascal",
            "The struggle alone pleases us, not the victory. \n\n\n - Blaise Pascal",
            "We know the truth, not only by the reason, but also by the heart. \n\n\n - Blaise Pascal",

            // Bob Dylan
            "Take care of all your memories. For you cannot relive them. \n\n\n - Bob Dylan",
            "No one is free, even the birds are chained to the sky. \n\n\n - Bob Dylan",
            "All I can do is be me, whoever that is. \n\n\n - Bob Dylan",
            "It's hard to speculate what tomorrow may bring. \n\n\n - Bob Dylan",
            "A mistake is to commit a misunderstanding. \n\n\n - Bob Dylan",
            "There is nothing so stable as change. \n\n\n - Bob Dylan",
            "You can't do something forever. \n\n\n - Bob Dylan",

            // Bruce Lee
            "Mistakes are always forgivable, if one has the courage to admit them. \n\n\n - Bruce Lee",
            "Knowledge will give you power, but character respect.\n\n\n - Bruce Lee",
            "If you love life, don't waste time, for time is what life is made up of. \n\n\n - Bruce Lee",
            "The key to immortality is first living a life worth remembering. \n\n\n - Bruce Lee",

            // C.S. Lewis
            "We are what we believe we are. \n\n\n - C.S. Lewis",
            "No one ever told me that grief felt so like fear. \n\n\n - C.S. Lewis",
            "Nothing that you have not given away will ever be really yours. \n\n\n - C.S. Lewis",
            "Joy is the serious business of Heaven. \n\n\n - C.S. Lewis",

            // 29-10-2016 (Totalt 177 quotes)

            // ZHU
            "The moon is only bright, cause it reflects the sun's shine",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textOne = (TextView) findViewById(R.id.textView1);
        Button pushMe = (Button) findViewById(R.id.button1);



        pushMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                int rand = (int) (Math.random()*177);
                textOne.setText(quotes[rand]);
            }


        });

    }
}
