package us.bojie.doordashlite.ui.main.restaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.data.models.Restaurant;

public class RestaurantsAdapter extends ListAdapter<Restaurant, RestaurantsAdapter.RestaurantsHolder> {

    public RestaurantsAdapter() {
        super(Restaurant.DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public RestaurantsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
        return new RestaurantsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantsHolder holder, int position) {
        holder.bind(getItem(position));
    }

    static class RestaurantsHolder extends RecyclerView.ViewHolder {
        ImageView restaurantLogo;
        ImageView restaurantFoodImg;
        TextView name;
        TextView type;
        TextView time;
        TextView star;
        TextView fee;
        RequestOptions options;

        public RestaurantsHolder(@NonNull View itemView) {
            super(itemView);
            restaurantLogo = itemView.findViewById(R.id.iv_image1);
            restaurantFoodImg = itemView.findViewById(R.id.iv_image2);
            name = itemView.findViewById(R.id.tv_name);
            type = itemView.findViewById(R.id.tv_type);
            time = itemView.findViewById(R.id.tv_time);
            star = itemView.findViewById(R.id.tv_star);
            fee = itemView.findViewById(R.id.tv_fee);
            options = new RequestOptions()
                    .placeholder(R.drawable.doordash);
        }

        void bind(Restaurant restaurant) {
            Glide.with(restaurantLogo.getContext())
                    .load(restaurant.getCoverImgUrl())
                    .apply(options)
                    .into(restaurantLogo);
            Glide.with(restaurantFoodImg.getContext())
                    .load(restaurant.getHeaderImgUrl())
                    .apply(options)
                    .into(restaurantFoodImg);
            name.setText(restaurant.getName());
            if (restaurant.getDescription().length() == 0) {
                type.setText(type.getContext().getString(R.string.dot));
            } else {
                type.setText(restaurant.getDescription());
            }
            time.setText(restaurant.getStatus());
            if (restaurant.getAverageRating().equalsIgnoreCase("0.0")) {
                star.setText(star.getContext().getString(R.string.newly_added));
            } else {
                star.setText(restaurant.getAverageRating());
            }
            int deliveryFee = restaurant.getDeliveryFee();
            if (deliveryFee == 0) {
                fee.setText(R.string.free_delivery);
            } else {
                fee.setText(fee.getContext().getString(R.string.delivery_fee, String.valueOf(deliveryFee)));
            }
        }
    }
}
