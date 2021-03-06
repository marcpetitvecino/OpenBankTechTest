package com.example.openbanktechtest.main.data.character

import com.google.gson.Gson
import org.junit.Test

class CharacterDTOTest {
    val response = "{\n" +
            "        \"id\": 1011334,\n" +
            "        \"name\": \"3-D Man\",\n" +
            "        \"description\": \"\",\n" +
            "        \"modified\": \"2014-04-29T14:18:17-0400\",\n" +
            "        \"thumbnail\": {\n" +
            "          \"path\": \"http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784\",\n" +
            "          \"extension\": \"jpg\"\n" +
            "        },\n" +
            "        \"resourceURI\": \"http://gateway.marvel.com/v1/public/characters/1011334\",\n" +
            "        \"comics\": {\n" +
            "          \"available\": 12,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/characters/1011334/comics\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/21366\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #14\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/24571\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #14 (SPOTLIGHT VARIANT)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/21546\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #15\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/21741\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #16\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/21975\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #17\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/22299\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #18\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/22300\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #18 (ZOMBIE VARIANT)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/22506\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #19\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/8500\",\n" +
            "              \"name\": \"Deadpool (1997) #44\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/10223\",\n" +
            "              \"name\": \"Marvel Premiere (1972) #35\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/10224\",\n" +
            "              \"name\": \"Marvel Premiere (1972) #36\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/comics/10225\",\n" +
            "              \"name\": \"Marvel Premiere (1972) #37\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 12\n" +
            "        },\n" +
            "        \"series\": {\n" +
            "          \"available\": 3,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/characters/1011334/series\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/1945\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007 - 2010)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/2005\",\n" +
            "              \"name\": \"Deadpool (1997 - 2002)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/series/2045\",\n" +
            "              \"name\": \"Marvel Premiere (1972 - 1981)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 3\n" +
            "        },\n" +
            "        \"stories\": {\n" +
            "          \"available\": 21,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/characters/1011334/stories\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/19947\",\n" +
            "              \"name\": \"Cover #19947\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/19948\",\n" +
            "              \"name\": \"The 3-D Man!\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/19949\",\n" +
            "              \"name\": \"Cover #19949\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/19950\",\n" +
            "              \"name\": \"The Devil's Music!\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/19951\",\n" +
            "              \"name\": \"Cover #19951\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/19952\",\n" +
            "              \"name\": \"Code-Name:  The Cold Warrior!\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/47184\",\n" +
            "              \"name\": \"AVENGERS: THE INITIATIVE (2007) #14\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/47185\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #14 - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/47498\",\n" +
            "              \"name\": \"AVENGERS: THE INITIATIVE (2007) #15\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/47499\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #15 - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/47792\",\n" +
            "              \"name\": \"AVENGERS: THE INITIATIVE (2007) #16\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/47793\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #16 - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/48361\",\n" +
            "              \"name\": \"AVENGERS: THE INITIATIVE (2007) #17\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/48362\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #17 - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/49103\",\n" +
            "              \"name\": \"AVENGERS: THE INITIATIVE (2007) #18\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/49104\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #18 - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/49106\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #18, Zombie Variant - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/49888\",\n" +
            "              \"name\": \"AVENGERS: THE INITIATIVE (2007) #19\",\n" +
            "              \"type\": \"cover\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/49889\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #19 - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/stories/54371\",\n" +
            "              \"name\": \"Avengers: The Initiative (2007) #14, Spotlight Variant - Int\",\n" +
            "              \"type\": \"interiorStory\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 20\n" +
            "        },\n" +
            "        \"events\": {\n" +
            "          \"available\": 1,\n" +
            "          \"collectionURI\": \"http://gateway.marvel.com/v1/public/characters/1011334/events\",\n" +
            "          \"items\": [\n" +
            "            {\n" +
            "              \"resourceURI\": \"http://gateway.marvel.com/v1/public/events/269\",\n" +
            "              \"name\": \"Secret Invasion\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"returned\": 1\n" +
            "        },\n" +
            "        \"urls\": [\n" +
            "          {\n" +
            "            \"type\": \"detail\",\n" +
            "            \"url\": \"http://marvel.com/characters/74/3-d_man?utm_campaign=apiRef&utm_source=c52efefb2223d6c12ca80626c74965a1\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"wiki\",\n" +
            "            \"url\": \"http://marvel.com/universe/3-D_Man_(Chandler)?utm_campaign=apiRef&utm_source=c52efefb2223d6c12ca80626c74965a1\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"comiclink\",\n" +
            "            \"url\": \"http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=c52efefb2223d6c12ca80626c74965a1\"\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n"

    @Test
    fun `given response when parsing dto is valid`() {
        val output = Gson().fromJson(response, CharacterDTO::class.java)
        assert(output != null)
    }
}