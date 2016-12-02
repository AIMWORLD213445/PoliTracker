import com.epicodus.politracker.Constants;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Guest on 12/2/16.
 */
public class GameService {

    public static void findGames(String query, Callback callback) {
        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.GIANT_BOMB_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.GAME_SEARCH, query);
        urlBuilder.addQueryParameter(Constants.API_KEY_QUERY_PARAMETER, Constants.GIANT_BOMB_KEY);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(callback);


    }
}
