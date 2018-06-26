(ns reagent-weather.quick-zipcode-forecast
  (:require [reagent.core :as r
             :refer           [atom]] ))

(defn quick-zipcode-forecast []
  [:span "test"])

;;(r/render-component [quick-zipcode-forecast])
;(r/render [quick-zipcode-forecast]
;          (.- js/document))

;;[:form
;   [:label "Zipcode" :for "zipcode"]
;   [:input {:type "text"
;            :name "zipcode"
;            :value @zipcode
;            :on-change #(reset! zipcode (-> % .-target .-value))}]]
;;

;;(defn ^:export quick-zipcode-forecast [])
