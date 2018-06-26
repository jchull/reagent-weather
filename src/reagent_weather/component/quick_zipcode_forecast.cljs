(ns reagent-weather.quick-zipcode-forecast.component
  (:require [reagent.core :as r
             :refer           [atom]]
            [reagent-weather.forecast.component :refer [forecast]]))

(defonce app-state (atom {:zipcode nil :forecast nil}))


(defn quick-zipcode-forecast []
    (fn []
      [:form
        [:label "Zipcode"]
        [:input
          {:type "text"
           :id "zipcode"
           :on-change #(swap! app-state assoc :zipcode (-> % .-target .-value))}]
        [forecast]] ))
