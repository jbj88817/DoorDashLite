package us.bojie.doordashlite.ui.main.restaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import us.bojie.doordashlite.R;
import us.bojie.doordashlite.data.models.Restaurant;

public class RestaurantsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Restaurant> restaurants = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((PostViewHolder) holder).bind(restaurants.get(position));
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
        notifyDataSetChanged();
    }

    static class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView restaurantLogo;
        ImageView restaurantFoodImg;
        TextView name;
        TextView type;
        TextView time;
        TextView star;
        TextView fee;
        RequestOptions options;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurantLogo = itemView.findViewById(R.id.iv_image1);
            restaurantFoodImg = itemView.findViewById(R.id.iv_image2);
            name = itemView.findViewById(R.id.tv_name);
            type = itemView.findViewById(R.id.tv_type);
            time = itemView.findViewById(R.id.tv_time);
            star = itemView.findViewById(R.id.tv_star);
            fee = itemView.findViewById(R.id.tv_fee);
            options = new RequestOptions()
                    .centerCrop()
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
            type.setText(restaurant.getDescription());
            time.setText(restaurant.getStatus());
            star.setText(String.valueOf(restaurant.getAverageRating()));
            int deliveryFee = restaurant.getDeliveryFee();
            if (deliveryFee == 0) {
                fee.setText(R.string.free_delivery);
            } else {
                fee.setText(fee.getContext().getString(R.string.delivery_fee, deliveryFee));
            }
        }
    }
}
